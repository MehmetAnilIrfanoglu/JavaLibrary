package Lab5;

public class BinarySearchTree {
	
	 Node root;
	 
	 BinarySearchTree () {
		 root=null;
		 }
	 
	 public void insert(int number)  {  
	         root = addBackground(root, number);  
	    } 
	 
	 public boolean find(int number) {
		    return findBackground(root, number);
		}
	 
	 public void display(Node root) {  
		  
         if(root == null){    
             return;  
          }  
         else {  
             if(root.left!= null)display(root.left);  
             System.out.print(root.data + " ");  
             if(root.right!= null)display(root.right);  
         }  
     }  
	 
	 private Node addBackground(Node selected, int number) {
		    if (selected == null) {
		        return new Node(number);
		    }

		    if (number < selected.data) {
		        selected.left = addBackground(selected.left, number);
		    } else if (number > selected.data) {
		        selected.right = addBackground(selected.right, number);
		    } else {return selected;}
		    return selected;
		}
	 
	 private boolean findBackground(Node selected, int number) {
		    if (selected == null) {
		        return false;
		    } 
		    if (number == selected.data) {
		        return true;
		    } 
		    return number < selected.data ? findBackground(selected.left, number) : findBackground(selected.right, number);
		}

}
