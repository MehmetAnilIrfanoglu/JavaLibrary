package p3completetest;



public class BSTree {// binary search tree class
	

   private BSTNode root;// root node
   private int depth=0;


   public BSTree() {// binary search tree constructor
	   root=null;//initilaze as zero 
   }
   
   public void insert(String data){// insert function
       root = insertBacground(root,data);// it calls background insert method in order to do main job
   }
   
   public String toString() {// it calls to inorder traversal method
      return this.inOrder(root);
   }

   public BSTNode search(String data) {// this method calls main search function
      return this.searchBackground(root, data);// calling background method
   }

   public BSTNode min() {// calls main method to find min node
	      return this.minNode(root);
	   }
   
   public BSTNode max() {// calls main method to find max node
	      return this.maxNode(root);
	   }
   
   private BSTNode minNode(BSTNode node){// main method to find min
       if(node.getLeftChild() != null){
           return minNode(node.getLeftChild());
       }
       return node;
   }
   
   private BSTNode maxNode(BSTNode node){//main method to find maximum element
       if(node.getRightChild() != null){
           return maxNode(node.getRightChild());
       }
       return node;
   }
   
   private BSTNode insertBacground(BSTNode node, String data){//main part of insert method
       if(node==null){//checking if node is null
    	   node = new BSTNode(data);// if it is null,creating new node
           return  node;
       }
       int compare= data.compareTo(node.getData());//it is the number comes from comparism
       if(compare<0){
           node.setLeftChild(insertBacground(node.getLeftChild(),data));//setting left child of the node
       }else if(compare>0){
           node.setRightChild(insertBacground(node.getRightChild(),data));//setting right chil of the node
       }
       return node;
   }
   
   private String inOrder(BSTNode node) {//background process of inorder traversal
	      String nodes = "";//saving all values as string
	      if (node != null) {
	         nodes = nodes + this.inOrder(node.getLeftChild());//save left child
	         nodes = nodes + node.toString() + "\n";//save parent
	         nodes = nodes + this.inOrder(node.getRightChild());//save right child
	      }
	      return nodes;
	   }
   
   private BSTNode searchBackground(BSTNode node, String data) {// main search function
	   
	      if (node == null) {
	         
	      } 
	      else {
	      
	         if (data.compareTo(node.getData()) == 0) {//the case that finding element
	        	 System.out.println(node.getData()+" has been found in tree");//printing data of found element
	        	 System.out.println("node has the depth of "+depth);// printing depth of node
	        	 System.out.println("size of subtree is "+size(node));// printing size of subtree
	        	 if (node.getLeftChild()==null && node.getRightChild()==null) {// checking if node is leaf or not
	        		   System.out.println(node.getData()+" is a leaf node");//node is leaf
	        	   }
	        	   else {
	        		   System.out.println(node.getData()+" is not a leaf node");// node is not leaf
	        	   }
	        	 
	        	depth=0;
	            return node;
	         }
	        
	         else if (data.compareTo(node.getData()) < 0) {//item couldnt found
	        	 depth= depth + 1;
	            return this.searchBackground(node.getLeftChild(), data);//continue from left subtree
	         }
	        
	         else {
	        	 depth= depth + 1;
	        	 return this.searchBackground(node.getRightChild(), data);//continue from right subtree
	         }
	      }
	      System.out.println(data+" couldnt found in tree");// the element that we searched couldnt found in tree
	      
	      return null;
	   }
   
   public void isLeaf(BSTNode node) {//this method is finding is a node leaf or not
	   if (node.getLeftChild()==null && node.getRightChild()==null) {
		   System.out.println("it is leaf");
	   }
	   else {
		   System.out.println("it is not leaf");
	   }
   }
   
   public int size(BSTNode node) // this method gives the size of subtree
   { 
       if (node == null) 
           return 0; 
       else
           return(size(node.getLeftChild()) + 1 + size(node.getRightChild())); 
   } 
   
}
