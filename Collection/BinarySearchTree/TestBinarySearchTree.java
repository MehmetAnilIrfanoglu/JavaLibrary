package Lab5;

public class TestBinarySearchTree {
	public static void main(String[] args) {
		BinarySearchTree binaryTree = new BinarySearchTree();
		binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(4);
        binaryTree.insert(2);
        binaryTree.insert(6);
        binaryTree.insert(7);
        binaryTree.insert(1);

        System.out.println(binaryTree.find(20));
        System.out.println(binaryTree.find(2));
        System.out.println(binaryTree.find(1));
        binaryTree.display(binaryTree.root);
	}

}
