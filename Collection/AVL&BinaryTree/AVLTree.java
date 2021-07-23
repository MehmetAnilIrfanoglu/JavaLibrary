package p3completetest;



import java.util.LinkedList;
import java.util.Queue;

public class AVLTree<T extends Comparable<T>> {
	AVLNode<T> root;//root node

	public AVLTree() {//sets root node
		root = null;
	}

	public AVLNode<T> insert(T data) {// insert function
		root = insert(root, data);//calls background insert
	
		int temp = balanceNumber(root);// checks the balance number
		if(temp==1) {//balance number is one
			root = rotateLeft(root);//do left rotate
		}
		if(temp==-1) {//balance number is minus 1
			root = rotateRight(root);//do right rotate
		}
		return root;
	}

	public AVLNode<T> insert(AVLNode<T> node, T data) {//background insert method
		if (node == null) return new AVLNode<T>(data); //if node is null it creates new node
		
		if (node.getData().compareTo(data) > 0) {
			node = new AVLNode<T>(node.getData(), insert(node.getLeft(), data),node.getRight());
			// node.setLeft(insert(node.getLeft(), data));
		} 
		
		else if (node.getData().compareTo(data) < 0) {
			// node.setRight(insert(node.getRight(), data));
			node = new AVLNode<T>(node.getData(), node.getLeft(), insert(node.getRight(), data));
		}
		// insertion completed but we must check the balance
		
		int temp=balanceNumber(node); // checks the balance number
		if(temp==1) {// balance is 1
			node = rotateLeft(node);// do left rotate
		}
		else if(temp==-1) {//balance is -1
			node = rotateRight(node);//do right rotate
		}
		else {
			return node;
		}
		
		return node;
	}
	
	public AVLNode<T> search(T data) {//method to find an element in avl tree
		AVLNode<T> local = root; //setting temp node to root
		while (local != null) {
			if (local.getData().compareTo(data) == 0) {//same element
				return local;
			}
			else if (local.getData().compareTo(data) > 0) {//not same , go left
				local = local.getLeft();
			}
			else {
				local = local.getRight();//not same , go right
			}
		}
		return null;
	}

	

	

	private AVLNode<T> rotateRight(AVLNode<T> node) {//left rotate method
		AVLNode<T> temp0 = node; //creating temp node to keep data
		AVLNode<T> temp1 = temp0.getLeft();//in here,we are creating temp nodes in order
		AVLNode<T> dummy0 = temp0.getRight();// to make rotation because we will
		AVLNode<T> dummy1 = temp1.getLeft();// break down connections so we need to
		AVLNode<T> dummy2 = temp1.getRight();// keep elements somewhere
		temp0 = new AVLNode<T>(temp0.getData(), dummy2, dummy0);
		temp1 = new AVLNode<T>(temp1.getData(), dummy1, temp0);
		return temp1;
	}

	private AVLNode<T> rotateLeft(AVLNode<T> node) {
		AVLNode<T> temp0 = node;
		AVLNode<T> temp1 = temp0.getRight();
		AVLNode<T> dummy0 = temp0.getLeft();
		AVLNode<T> dummy1 = temp1.getLeft();
		AVLNode<T> dummy2 = temp1.getRight();
		temp0 = new AVLNode<T>(temp0.getData(), dummy0, dummy1);
		temp1 = new AVLNode<T>(temp1.getData(), temp0, dummy2);
		return temp1;
	}
	
	

	public String toString() {//printing avl tree elements
		return root.toString();//calls printtree method in order to print data
	}

	public void PrintTree() {
		
		Queue<AVLNode<T>> queue = new LinkedList<AVLNode<T>>();// we are creating queue to keep elements
		root.height = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			AVLNode<T> node = queue.poll();
			System.out.println(node);//print node
			AVLNode<T> right = node.getRight();//getting right
			AVLNode<T> left = node.getLeft();//getting left
			int level = node.height;
			if (left != null) {
				left.height = level + 1;
				queue.add(left);
			}
			if (right != null) {
				right.height = level + 1;
				queue.add(right);
			}
		}
	}
	
	public T Maximum() {//gets rightmost child
		AVLNode<T> local = root;
		if (local == null)
			return null;
		while (local.getRight() != null)
			local = local.getRight();
		return local.getData();
	}

	public T Minimum() {//gets lefthmost child
		AVLNode<T> local = root;
		if (local == null)
			return null;
		while (local.getLeft() != null) {
			local = local.getLeft();
		}
		return local.getData();
	}
	
	private int balanceNumber(AVLNode<T> node) {//does basic math operation to keep balance
		
		int right = depth(node.getRight());
		int left = depth(node.getLeft());
		if (left - right >= 2)
			return -1;
		else if (left - right <= -2)
			return 1;
		return 0;
	}

	private int depth(AVLNode<T> node) {//finds depth
		if (node == null)
		return 0;
		return node.getDepth();
	}
	
	//in this part, ý had problems with delete method, ý could delete elemnts but ý dont know
	//why it gives error sometimes. it deletes the element that ý want but it gives nullpointer
	//exception when ý try to delete min element or root.
	public AVLNode<T> delete(T value){
		return this.deleteBackground(root,value);
	}
	
	private AVLNode<T> deleteBackground(AVLNode<T> root, T value) {
        
        if (root == null)
            return root;

        if ( value.compareTo(root.getData())<0 )
            root.setLeft(deleteBackground(root.getLeft(), value));

        else if( value.compareTo(root.getData())>0 )
            root.setRight(deleteBackground(root.getRight(), value));

        else {
            
            if( (root.getLeft() == null) || (root.getRight() == null) ) {

                AVLNode<T> temp;
                if (root.getLeft() != null) temp = root.getLeft();
                
                else temp = root.getRight();

                if(temp == null) {
                    temp = root;
                    root = null;
                }
                else root = temp; 

                temp = null;
            }
            
            else {
                
                AVLNode<T> temp = null; 
                temp.setData(this.Minimum());//this method gives error because of this part
                //but ý dont know why.
          
                root.setData(temp.getData());
                root.setRight(deleteBackground(root.getRight(), temp.getData()));
             
            }
        }

        if (root == null)
            return root;

        int balance = balanceNumber(root);

        if (balance > 1 && balanceNumber(root.getLeft()) >= 0)
            return rotateRight(root);
        
        if (balance > 1 && balanceNumber(root.getLeft()) < 0) {// first left then right
            root.setLeft(rotateLeft(root.getLeft()));
            return rotateRight(root);
        }
  
        if (balance < -1 && balanceNumber(root.getRight()) <= 0) return rotateLeft(root);
     // first right then right
       
        if (balance < -1 && balanceNumber(root.getRight()) > 0) { // first right then left 
            root.setRight(rotateRight(root.getRight()));
            return rotateLeft(root);
        }

        return root;
    }
}