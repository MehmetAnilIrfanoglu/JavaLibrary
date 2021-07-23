package p3completetest;


public class BSTNode {
	
	private BSTNode left;//left child
	private BSTNode right;//right child
	private String data;//data to keep

	public BSTNode(String d) {//constructor
		data = d;
		left = null;
		right = null;
	}

	public String getData() {//getting private data
		return data;
	}

	public BSTNode getRightChild() {//getting private right child
		return right;
	}
	
	public BSTNode getLeftChild() {//getting private left child
		return left;
	}
	
	public void setData(String d) {//setting private data
		data = d;
	}
	
	public void setRightChild(BSTNode r) {//setting private right child
		right = r;
	}
	
	public void setLeftChild(BSTNode l) {//setting private left child
		left = l;
	}
	
	public String toString() {//tostring method
		String disp = data.toString();
		return disp;
	}

}
