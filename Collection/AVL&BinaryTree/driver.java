



import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class driver {
	public static void main(String[] args) throws IOException {
		
			ArrayList<String> characters = new ArrayList<String>();//this is for the keep elements of starwars.txt
			Scanner scan = new Scanner(Paths.get("starwars.txt"));//this file provided with homework
			
			ArrayList<String> searchElements = new ArrayList<String>();//this is for the keep elements to search
			Scanner secondScan = new Scanner(Paths.get("testfile.txt"));// this file is not provided , so ý created mine for testing
			//it could be replaced by testfile.txt
			
			while (scan.hasNextLine()) {//reading starwars.txt and saving it
				String s = scan.nextLine();
				if (s.equals("")) {
				}
				else {
				characters.add(s);
				}
			}
			
			while (secondScan.hasNextLine()) {//reading searchfile and saving it
				String second = secondScan.nextLine();
				if (second.equals("")) {
				}
				else {
				searchElements.add(second);
				}
			}
			
			long start, end, elapsed,start1,end1,elapsed1,start2,end2,elapsed2,start3,end3,elapsed3;
			//these long values are for to show elapsed time between steps
			BSTree tree = new BSTree();//creating binary search tree
			start = System.nanoTime();//time started
	         System.out.println("Inserting to tree...");
	         
	         for (int i=0;i<characters.size();i++) {//all starwars characters will be inserted by for loop
	        	 tree.insert(characters.get(i));
				}
	         
	         end = System.nanoTime();//time end
	         elapsed = (end-start)/characters.size();//this is the average time
	         System.out.println("The average time to insert all element into BST is "+elapsed);//average time reported
	         
	         System.out.println("inorder traversal:\n" + tree.toString());//inorder traversal
	         
	         start1 = System.nanoTime();//time start for the find min element
	         System.out.println("Minimum data in that tree is "+tree.min().getData());//min element was found
	         end1 = System.nanoTime();
	         elapsed1=end1-start1;
	         System.out.println("The time to find minimum element is "+elapsed1+"\n");//reporting time
	         start2= System.nanoTime();
		     System.out.println("Maximum data in that tree is "+tree.max().getData());//max element was found
		     end2=System.nanoTime();
		     elapsed2=end2-start2;
		     System.out.println("The time to find maximum element is "+elapsed2+"\n");//reporting time
		      
		      for(int i=0;i<searchElements.size();i++) {//in this step, we are trying to find elements which comes
		    	  //from second folder in bstree
		    	  start3 = System.nanoTime();
		    	  tree.search(searchElements.get(i));//finding element
		    	  end3 = System.nanoTime();
		    	  elapsed3 = end3-start3;
		    	  System.out.println("The time to find element is "+elapsed3);
		    	  System.out.println("-------------------------");
		    	  
		      }
		      // for part A, all steps are done
		      
		      	System.out.println("*********************************");
		      	System.out.println("*********************************");
		      	System.out.println("*********************************");
		      	System.out.println("Part B");
		      
		      	Scanner scanner = new Scanner(Paths.get("data_main.csv"));//readind csv file
		        Random rand = new Random(); //creates random number
		        
		        AVLTree<String> serial = new AVLTree<String>();//first avltree to keep data from csv file. it keeps first column
		        AVLTree<String> model = new AVLTree<String>();//second avltree to keep data from csv file. it keeps second column
		        AVLTree<Long> capacity = new AVLTree<Long>();//third avltree to keep data from csv file. it keeps third column
		        AVLTree<Integer> power = new AVLTree<Integer>();//fourth avltree to keep data from csv file. it keeps fourth column
		        
		        ArrayList<String> HDTestData0 = new ArrayList<String>();//Here are the arraylist as wanted in assigment
		        ArrayList<String> HDTestData1 = new ArrayList<String>();// ý keep every data in these arraylists seperately
		        ArrayList<Long> HDTestData2 = new ArrayList<Long>();//in next parts , we will choose random numbers from here
		        ArrayList<Integer> HDTestData3 = new ArrayList<Integer>();
		        
		        
		        // ý keep random numbers in that array. for example ý will select random 1000 element with random
		        int[] randForCompleteAvl = new int[1000];// index. 
		        for(int i=0;i<randForCompleteAvl.length;i++) {
		        	randForCompleteAvl[i] = rand.nextInt(2000);//index range is 0 to 1999
		        }
		        // ý do in that way because if ý put big numbers here
		        // printed lines couldnt see in console
		        // because there are too much data and console didnt show it
		        
		        int[] randForSelected = new int[50];//this array is for the choosen datas
		        for(int i=0;i<randForSelected.length;i++) {// it keeps random indexes for next steps
		        	randForSelected[i] = rand.nextInt(2000);//we will take random indexes from here in order to search
		        }
		        
		        String[] tempor = new String[4];
				String lin = scanner.nextLine();	
		    	tempor=lin.split(",");//we scan first line
		    	// because in first line there are 4 strings which are labels
		    	// they are unnecessary
		    	
		    	//here we are reading csv file and we are saving data in HdTestData
				while (scanner.hasNextLine()) {
					
					String[] temporary = new String[4];
					String line = scanner.nextLine();	
		        	temporary=line.split(",");
		        	HDTestData0.add(temporary[0]);
		        	HDTestData1.add(temporary[1]);
		        	HDTestData2.add(Long.parseLong(temporary[2]));
		        	HDTestData3.add(Integer.parseInt(temporary[3]));
				}
		        scanner.close();
		        
		        long start5,end5,elapsed5,start6,end6,elapsed6,start7,end7,elapsed7,start8,end8,elapsed8;
		        // longs keep time
		        //we are inserting wanted elements into the avl trees respectively
		        // ý am so tired hocam but, ý hope next parts are clear
		        start5=System.nanoTime();
		        for(int i=0;i<randForCompleteAvl.length;i++) {//inserting elements into first tree
		        	serial.insert(HDTestData0.get(randForCompleteAvl[i]));
		        }
		        end5=System.nanoTime();
		        elapsed5=(end5-start5)/randForCompleteAvl.length;
		        System.out.println("Average time to insert serial_number avl tree is "+elapsed5);
		        
		        start6=System.nanoTime();
		        for(int i=0;i<randForCompleteAvl.length;i++) {//inserting elements into second tree
		        	model.insert(HDTestData1.get(randForCompleteAvl[i]));
		        }
		        end6=System.nanoTime();
		        elapsed6=(end6-start6)/randForCompleteAvl.length;
		        System.out.println("Average time to insert model avl tree is "+elapsed6);
		        
		        start7=System.nanoTime();
		        for(int i=0;i<randForCompleteAvl.length;i++) {//inserting elements into third tree
		        	capacity.insert(HDTestData2.get(randForCompleteAvl[i]));
		        }
		        end7=System.nanoTime();
		        elapsed7=(end7-start7)/randForCompleteAvl.length;
		        System.out.println("Average time to insert capacity_bytes avl tree is "+elapsed7);
		        
		        start8=System.nanoTime();
		        for(int i=0;i<randForCompleteAvl.length;i++) {//inserting elements into fourth tree
		        	power.insert(HDTestData3.get(randForCompleteAvl[i]));
		        }
		        end8=System.nanoTime();
		        elapsed8=(end8-start8)/randForCompleteAvl.length;
		        System.out.println("Average time to insert power_on_hours avl tree is "+elapsed8);
		        
		        System.out.println();
		        System.out.println("Printing serial_number AVL tree");
		        serial.PrintTree();//printing first tree
		        System.out.println();
		        System.out.println("Printing model AVL tree");
		        model.PrintTree();//printing second tree
		        System.out.println();
		        System.out.println("Printing capacity_bytes AVL tree");
		        capacity.PrintTree();//printing third tree
		        System.out.println();
		        System.out.println("Printing power_on_hours AVL tree");
		        power.PrintTree();//printing fourth tree
		        System.out.println();
		        
		        System.out.println("serial_number AVL tree");
		        long start9,end9,elapsed9,start10,end10,elapsed10,start11,end11,elapsed11,start12,end12,elapsed12;
		        //longs keeps times again
		        start9=System.nanoTime();
		        for(int i =0;i<randForSelected.length;i++) {//search in first avl tree
		        	try
		            { 
		        		System.out.println();
		            	System.out.println("does it find ?");
		                AVLNode<String> section0 = serial.search(HDTestData0.get(randForSelected[i]));
		                System.out.println("The name of element is "+ section0.getData());
		                System.out.println("The depth of element is "+section0.getDepth());
		                System.out.println("The height of element is "+section0.height);
		            } 
		            catch(NullPointerException e) 
		            { 
		                System.out.println("Element couldnt find in avl tree"); 
		            } 
		        }
		        end9=System.nanoTime();
		        elapsed9=(end9-start9)/randForSelected.length;
		        System.out.println("Average time to find in serial_number avl tree is "+elapsed9);
		        
		        start10=System.nanoTime();
		        	System.out.println("model AVL tree");
		        	for(int i =0;i<randForSelected.length;i++) {//search in second avl tree
		        	
		        	try
		            { 
		        		System.out.println();
		            	System.out.println("does it find ?");
		                AVLNode<String> section1 = model.search(HDTestData1.get(randForSelected[i]));
		                System.out.println("The name of element is "+ section1.getData());
		                System.out.println("The depth of element is "+section1.getDepth());
		                System.out.println("The height of element is "+section1.height);
		                
		            } 
		            catch(NullPointerException e) 
		            { 
		                System.out.println("Element couldnt find in avl tree"); 
		            } 
		        }
		        	end10=System.nanoTime();
		        	elapsed10=(end10-start10)/randForSelected.length;
		        	System.out.println("Average time to find in model avl tree is "+elapsed10);
		        	
		        	start11=System.nanoTime();
		        	System.out.println("capacity_bytes AVL tree");
		        	for(int i =0;i<randForSelected.length;i++) {//search in third avl tree
		            	
		            	try
		                { 
		            		System.out.println();
		                	System.out.println("does it find ?");
		                    AVLNode<Long> section2 = capacity.search(HDTestData2.get(randForSelected[i]));
		                    System.out.println("The name of element is "+ section2.getData());
		                    System.out.println("The depth of element is "+section2.getDepth());
		                    System.out.println("The height of element is "+section2.height);
		                    
		                } 
		                catch(NullPointerException e) 
		                { 
		                    System.out.println("Element couldnt find in avl tree"); 
		                } 
		            }
		        	end11=System.nanoTime();
		        	elapsed11=(end11-start11)/randForSelected.length;
		        	System.out.println("Average time to find in capacity_bytes avl tree is "+elapsed11);
		        	
		        	start12=System.nanoTime();
		        	System.out.println("power_on_hours AVL tree");
		        	for(int i =0;i<randForSelected.length;i++) {//search in fourth avl tree
		            	
		            	try
		                { 
		            		System.out.println();
		                	System.out.println("does it find ?");
		                    AVLNode<Integer> section3 = power.search(HDTestData3.get(randForSelected[i]));
		                    System.out.println("The name of element is "+ section3.getData());
		                    System.out.println("The depth of element is "+section3.getDepth());
		                    System.out.println("The height of element is "+section3.height);
		                    
		                } 
		                catch(NullPointerException e) 
		                { 
		                    System.out.println("Element couldnt find in avl tree"); 
		                } 
		            }
		        	end12=System.nanoTime();
		        	elapsed12=(end12-start12)/randForSelected.length;
		        	System.out.println("Average time to find in power_on_hours avl tree is "+elapsed12);
	          
	}

}
