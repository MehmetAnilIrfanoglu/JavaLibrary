package p3completetest;



public class AVLNode<T extends Comparable<T>> implements Comparable<AVLNode<T>> {

	
	private T data;//keeps data
	public int height;//keeps height
	private int depth;//keeps depth
	private AVLNode<T> left;//keeps right child
	private AVLNode<T> right;//keeps left child

	public AVLNode(T data) {//basic constructor
		this(data, null, null);
	}

	public AVLNode(T data, AVLNode<T> left, AVLNode<T> right) {//super constructor
		super();
		this.right = right;
		this.left = left;
		this.data = data;
		
		if (left == null && right == null)setDepth(1); // set default depth
		else if (left == null)setDepth(right.getDepth() + 1); //increase depth
		else if (right == null)setDepth(left.getDepth() + 1); // increase depth
		else setDepth(Math.max(left.getDepth(), right.getDepth()) + 1);//set depth
	}

	public T getData() {//get private data
		return data;
	}
	
	public int getDepth() {// get private depth
		return depth;
	}
	
	public AVLNode<T> getRight() {//get private right child
		return right;
	}
	
	public AVLNode<T> getLeft() {// get private left child
		return left;
	}

	public void setRight(AVLNode<T> right) {// set private right child
		this.right = right;
	}
	
	public void setLeft(AVLNode<T> left) {// set private left child
		this.left = left;
	}

	public void setDepth(int depth) {// set private depth
		this.depth = depth;
	}
	
	public void setData(T data) {//set private data
		this.data = data;
	}

	@Override
	public int compareTo(AVLNode<T> o) {// comes from compareto ,it is needed for generic
		return this.data.compareTo(o.data);
	}

	@Override
	public String toString() {//to string method
		return "Depth "+height+" Height " + depth + ": " + data;
	}

}