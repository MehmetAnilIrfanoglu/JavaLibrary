


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
 
class Scores {
	int pair1;
	int pair2;
	int score;
	
	Scores(){}
	
	Scores(int pair1,int pair2,int score){
		this.pair1 = pair1;
		this.pair2 = pair2;
		this.score = score;
	}
}

class Merge {
	
	int pair1;
	int pair2;
	int score;
	
	Merge(){}
	
	Merge(int pair1,int pair2,int score){
		this.pair1 = pair1;
		this.pair2 = pair2;
		this.score = score;
	}
}

class Quick {
	
	int pair1;
	int pair2;
	int score;
	
	Quick(){}
	
	Quick(int pair1,int pair2,int score){
		this.pair1 = pair1;
		this.pair2 = pair2;
		this.score = score;
	}
}

class Heap {
	
	int pair1;
	int pair2;
	int score;
	
	Heap(){}
	
	Heap(int pair1,int pair2,int score){
		this.pair1 = pair1;
		this.pair2 = pair2;
		this.score = score;
	}
}

class Insertion {
	
	int pair1;
	int pair2;
	int score;
	
	Insertion(){}
	
	Insertion(int pair1,int pair2,int score){
		this.pair1 = pair1;
		this.pair2 = pair2;
		this.score = score;
	}
}






class Main{
	
	
	
	public static void mergeSort(int start,int end,Merge arr[]) {
	
        if (start < end) {
        
        int medium =(start + end)/2;
        mergeSort( start, medium,arr);
        mergeSort( medium + 1, end,arr);       
        mergeBackground( start, medium, end,arr);
        }
    }
	
	
	
	 public static void quickSort( int start, int end,Quick arr[]) { 
	     
	    if (start < end) {
	        	
	    int pivot = quickBackground(start,end,arr);  
	    quickSort( start, pivot-1,arr); 
	    quickSort( pivot+1, end,arr); 
	    } 
	} 
	  
	 
	 public static void heapSort(Heap arr[]) {
	    
	        int length = arr.length;
	        
	        for (int i = (length / 2) - 1;0<= i; i--) {
	            heapsortBackground(length, i,arr);
	        }
	       
	        for (int last =(length-1); 0 < last; last--) {  
	        	Heap temp = arr[0];
	            arr[0] = arr[last];
	            arr[last] = temp;
	            heapsortBackground( last, 0,arr);
	        }
	    }
	 
	 public static void insertionSort(Insertion arr[]) 
	    { 
	    
	        for (int forward = 1; forward < arr.length; ++forward) { 
	        	int backward = forward - 1; 
	        	Insertion temp = arr[forward];
	            int compare_element = arr[forward].score;
	           
	            
	  
	            while(true)  { 
	            	if((0 <= backward &&  compare_element < arr[backward].score)==false)break;
	                arr[backward+1] = arr[backward]; 
	                backward = backward - 1; 
	            } 
	            arr[backward+1] = temp; 
	        } 
	    } 
		
	
	public static void mergeBackground( int start, int medium, int end,Merge merging[]) {
    
       
        int leftSubLength = (medium - start)+ 1;
        int rightSubLength = end - medium;
 
        Merge L[] = new Merge[leftSubLength];
        
        for (int i=0;i<L.length;i++) {
			L[i]= new Merge();
		}
        
        Merge R[] = new Merge[rightSubLength];
        
        for (int i=0;i<R.length;i++) {
			R[i]= new Merge();
		}
 
        for (int i = 0; i < leftSubLength; ++i) {
            L[i].score = merging[start + i].score;
        	L[i].pair1 = merging[start + i].pair1;
        	L[i].pair2 = merging[start + i].pair2;
        }
        
        for (int j = 0; j < rightSubLength; ++j) {
            R[j].score = merging[medium + 1 + j].score;
            R[j].pair1 = merging[medium + 1 + j].pair1;
            R[j].pair2 = merging[medium + 1 + j].pair2;
 
        }
         
        int current_index = start;
        int left_index = 0; 
        int	right_index = 0;
  
        while (true) {
        	if ((left_index < leftSubLength && right_index < rightSubLength)==false)break;
            
        	if (L[left_index].score <= R[right_index].score) {
                merging[current_index].score = L[left_index].score;
                merging[current_index].pair1 = L[left_index].pair1;
                merging[current_index].pair2 = L[left_index].pair2;    
                left_index++;
            }
        	
            else {
            	merging[current_index].score = R[right_index].score;
            	merging[current_index].pair1 = R[right_index].pair1;
            	merging[current_index].pair2 = R[right_index].pair2;
                right_index++;
            }
            current_index++;
        }
  
        while (true) {
        	if ((left_index < leftSubLength)==false)break;
        	merging[current_index].score = L[left_index].score;
            merging[current_index].pair1 = L[left_index].pair1;
            merging[current_index].pair2 = L[left_index].pair2;
            left_index++;
            current_index++;
        }
 
        while (true) {
        	if ((right_index < rightSubLength)==false)break;
        	merging[current_index].score = R[right_index].score;
        	merging[current_index].pair1 = R[right_index].pair1;
        	merging[current_index].pair2 = R[right_index].pair2;     
            right_index++;
            current_index++;
        }
    }
   
    public static int quickBackground(int start, int end,Quick arr[]) {
     
        int pivot = arr[end].score;  
        int current_index = (start-1); 
        for (int j = start;j<end;j++) 
        {       
            if (arr[j].score < pivot) 
            { 
                current_index++; 
             
                Quick temp = arr[current_index]; 
                arr[current_index] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        Quick temp = arr[current_index+1]; 
        arr[current_index+1] = arr[end]; 
        arr[end] = temp; 
  
        return current_index+1; 
    } 
  
  
    public static void heapsortBackground( int last, int current_index,Heap arr[]) {
    	
    	int left=(2*current_index)+1; 
        int right=(2*current_index)+2; 
        int biggest=current_index; 
          
        if (left < last && arr[left].score > arr[biggest].score) {
            biggest = left;
        }
        
        if (right < last && arr[right].score > arr[biggest].score) {
            biggest = right;
        }
        
        if (current_index != biggest) {
        	Heap temp = arr[current_index];
            arr[current_index] = arr[biggest];
            arr[biggest] = temp;  
            heapsortBackground( last, biggest,arr);
        }
    }
	
    

	public static void main (String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		File out_file = new File("ScoreWithPairs_NotSorted.txt");
		out_file.createNewFile();
		FileWriter write = new FileWriter(out_file);
		
		File out_file2 = new File("ScoreWithPairs_Sorted.txt");
		out_file2.createNewFile();
		FileWriter write2 = new FileWriter(out_file2);
		
		File out_file3 = new File("NegativePairs.txt");
		out_file3.createNewFile();
		FileWriter write3 = new FileWriter(out_file3);
			
		File out_file5 = new File("MergeSortResult.txt");
		out_file5.createNewFile();
		FileWriter write5 = new FileWriter(out_file5);
		
		File out_file6 = new File("QuickSortResult.txt");
		out_file6.createNewFile();
		FileWriter write6 = new FileWriter(out_file6);
		
		File out_file7 = new File("HeapSortResult.txt");
		out_file7.createNewFile();
		FileWriter write7 = new FileWriter(out_file7);
		
		File out_file8 = new File("InsertionSortResult.txt");
		out_file8.createNewFile();
		FileWriter write8 = new FileWriter(out_file8);
    	
    	Scanner scan = new Scanner(Paths.get("FinalExamGraphFile.txt"));
    	Scanner scan2 = new Scanner(Paths.get("Positive.txt"));
    	Random rand = new Random();
    	
		int length = 32836;
		int length2 = 5592;
		
    	String[] temporary = new String[3];
    	
    	
    	Scores score[] = new Scores[11184]; 
		for (int i=0;i<score.length;i++) { 
			score[i]= new Scores();	
		}
		
	
    	int first[] = new int[length];
    	int second[] = new int[length];
    	int weight[] = new int[length];
    	
    	String[] temporary2 = new String[2];
    	
    	int pos1[] = new int[length2];
    	int pos2[] = new int[length2];
    		
    	int neg1[] = new int[length2];
    	int neg2[] = new int[length2];
    	
    	for (int i=0;i<length;i++) {
    		String line = scan.nextLine();	
        	temporary=line.split("\\s+");
        	first[i]= Integer.parseInt(temporary[0]);
        	second[i]= Integer.parseInt(temporary[1]);
        	weight[i]= Integer.parseInt(temporary[2]); 	
        	}
    	
       	for (int i=0;i<length2;i++) {
        		String line = scan2.nextLine();
            	temporary2=line.split("\\s+");
            	pos1[i]= Integer.parseInt(temporary2[0]);
            	pos2[i]= Integer.parseInt(temporary2[1]);
            	
            }
    	
    	ArrayList<String> kontrol = new ArrayList<String>();
    	
    	ArrayList<String> onlyPos = new ArrayList<String>();
    	
    	String temp11;
    	for (int i=0;i<length2;i++) {
    		temp11 = pos1[i]+" "+pos2[i];
    		kontrol.add(temp11);
    		onlyPos.add(temp11);
    	}
    	
    	String temp21;
    	for (int i=0;i<first.length;i++) {
    		temp21 = first[i]+" "+second[i];
    		kontrol.add(temp21);
    	}
    	   	
    	ArrayList<Edge> connections = new ArrayList<Edge>();
    	for (int i=0;i<length;i++) {
    		connections.add(new Edge(first[i], second[i], weight[i]));
    	}
  
        Graph graph = new Graph(connections);
        
        
        int count =0;
        for (int i=0;i<length2;i++) {
        	
        	while (true) {
 	
        			int temp = first[rand.nextInt(first.length)];
        			int temp2 = second[rand.nextInt(second.length)];	
        			String check = temp+" "+temp2;			
        			boolean has =kontrol.contains(check)||(temp==temp2);
                	if (has==false) {
                		kontrol.add(check);
                		neg1[count]=temp;
                		neg2[count]=temp2;
                		count++;
                		break;
                	}
            	
        	}
        	
        }
        
    
        ArrayList<Integer> area1 = new ArrayList<Integer>();
        ArrayList<Integer> area2 = new ArrayList<Integer>();
        
        int scoreIndex=0;
        int commoncount1 =0;
        for (int i=0;i<length2;i++) {
        	area1 = Graph.finditem(graph,pos1[i],false);
        	area2 = Graph.finditem(graph,pos2[i],false);
        	
        
             for (int j =0;j<area1.size();j++) {
             	int a =area1.get(j);
             	boolean commoncheck = area2.contains(a);
            
             	if (commoncheck) {
             		commoncount1++;
             	}
             }
          
             score[scoreIndex].score=commoncount1;
             score[scoreIndex].pair1=pos1[i];
             score[scoreIndex].pair2=pos2[i];
             scoreIndex++;
             commoncount1=0;
             area1.clear();
             area2.clear();
        }
        
      
        area1.clear();
        area2.clear();
        int commoncount2 =0;
        for (int i=0;i<length2;i++) {
        	area1 = Graph.finditem(graph,neg1[i],false);
        	area2 = Graph.finditem(graph,neg2[i],false);
        	
        
             for (int j =0;j<area1.size();j++) {
             	int a =area1.get(j);
             	boolean commoncheck = area2.contains(a);
             
             	if (commoncheck) {
             		commoncount2++;
             	}
             }
             
             score[scoreIndex].score=commoncount2;
             score[scoreIndex].pair1=neg1[i];
             score[scoreIndex].pair2=neg2[i];
             scoreIndex++;
             commoncount2=0;
             area1.clear();
             area2.clear();
        	}
        
	       
			for(int i=0;i<length2;i++) {
	        	write3.write(neg1[i]+" "+neg2[i]);
				write3.write("\r\n");
	        }
			write3.flush();
			write3.close();
	
			
        		String answer;

        		while(true) {
        			
        		System.out.println("Please Insert the number that you want to search");
        		int item = sc.nextInt();
        		sc.nextLine();
        		Graph.finditem(graph,item,true);
        		System.out.println("Do you want to continue ? if you want Type yes");
        		answer = sc.nextLine();
        		if(answer.equals("yes")==false)break;
        		}
        	

        		for(int i=0;i<11184;i++) {
                	write.write(score[i].pair1+" "+score[i].pair2+" "+score[i].score);
        			write.write("\r\n");
                }
        		write.flush();
        		write.close();
        		
	
        		long start0,end0,elapsed0,start1,end1,elapsed1,start2,end2,elapsed2,start3,end3,elapsed3;
        		
        		
        		Merge mergeSortArray[]= new Merge[11184];
        		for (int i=0;i<mergeSortArray.length;i++) { 
        			mergeSortArray[i]= new Merge();
        			
        		}
        		
        		for (int i=0;i<mergeSortArray.length;i++) {
        			mergeSortArray[i].pair1=score[i].pair1;
        			mergeSortArray[i].pair2=score[i].pair2;
        			mergeSortArray[i].score=score[i].score;
        			
        		}
        		
        		start0 =System.currentTimeMillis();
        		mergeSort( 0, mergeSortArray.length-1,mergeSortArray);
        		end0 =System.currentTimeMillis();
        		elapsed0=end0-start0;
        		System.out.println("Time Elapsed For MergeSort is "+elapsed0);
        		System.out.println();
        		
        		for (int i=0;i<score.length;i++) {
        			write5.write(mergeSortArray[i].pair1+" "+mergeSortArray[i].pair2+" "+mergeSortArray[i].score);
        			write5.write("\r\n");
        		}
        		write5.flush();
        		write5.close();
        		
        		
        		
        		
        		Quick quickSortArray[]= new Quick[11184];
        		for (int i=0;i<quickSortArray.length;i++) { 
        			quickSortArray[i]= new Quick();
        			
        		}
        		
        		for (int i=0;i<quickSortArray.length;i++) {
        			quickSortArray[i].pair1=score[i].pair1;
        			quickSortArray[i].pair2=score[i].pair2;
        			quickSortArray[i].score=score[i].score;
        			
        		}
        		
        		
        		start1 =System.currentTimeMillis();
        		quickSort(0, quickSortArray.length-1,quickSortArray);
                end1 =System.currentTimeMillis();
                elapsed1=end1-start1;
                System.out.println("Time Elapsed For QuickSort is "+elapsed1);
        		System.out.println();
        		
        		for (int i=0;i<score.length;i++) {
        			write6.write(quickSortArray[i].pair1+" "+quickSortArray[i].pair2+" "+quickSortArray[i].score);
        			write6.write("\r\n");
        		}	
        		write6.flush();
        		write6.close();
                
        		Heap heapSortArray[]= new Heap[11184];
        		for (int i=0;i<heapSortArray.length;i++) { 
        			heapSortArray[i]= new Heap();
        			
        		}
        		for (int i=0;i<heapSortArray.length;i++) {
        			heapSortArray[i].pair1=score[i].pair1;
        			heapSortArray[i].pair2=score[i].pair2;
        			heapSortArray[i].score=score[i].score;	
        		}
        		
                start2 =System.currentTimeMillis();
                heapSort(heapSortArray);
                end2 =System.currentTimeMillis();
                elapsed2=end2-start2;
                System.out.println("Time Elapsed For HeapSort is "+elapsed2);
        		System.out.println();
        		
        		
        		for (int i=0;i<score.length;i++) {
        			write7.write(heapSortArray[i].pair1+" "+heapSortArray[i].pair2+" "+heapSortArray[i].score);
        			write7.write("\r\n");
        		}		
        		write7.flush();
        		write7.close();
                
        		
        		Insertion insertionSortArray[]= new Insertion[11184];
        		for (int i=0;i<insertionSortArray.length;i++) { 
        			insertionSortArray[i]= new Insertion();
        			
        		}
        		
        		for (int i=0;i<insertionSortArray.length;i++) {
        			insertionSortArray[i].pair1=score[i].pair1;
        			insertionSortArray[i].pair2=score[i].pair2;
        			insertionSortArray[i].score=score[i].score;
        			
        		}
        		
                start3 =System.currentTimeMillis();
                insertionSort(insertionSortArray);
                end3 =System.currentTimeMillis();
                elapsed3=end3-start3;
                System.out.println("Time Elapsed For InsertionSort is "+elapsed3);
        		System.out.println();
        		
        		for (int i=0;i<score.length;i++) {
        			write8.write(insertionSortArray[i].pair1+" "+insertionSortArray[i].pair2+" "+insertionSortArray[i].score);
        			write8.write("\r\n");
        		}
        		write8.flush();
        		write8.close();
        		
               
                for (int i=0;i<score.length;i++) {
                	score[i].pair1=heapSortArray[i].pair1;
        			score[i].pair2=heapSortArray[i].pair2;
        			score[i].score=heapSortArray[i].score;	
        		}
        		

        int ratio=0;
        for(int i=0;i<11184;i++) {
        	if(i<5592) {
        		write2.write(score[i].pair1+" "+score[i].pair2+" "+score[i].score);
    			write2.write("\r\n");
        	}
        	if(i==5592) {
        		String temp1 =score[i].pair1+" "+score[i].pair2;      
        		if(onlyPos.contains(temp1)) {
        			ratio++;
        		}
        		write2.write("Middle");
    			write2.write("\r\n");
    			write2.write(score[i].pair1+" "+score[i].pair2+" "+score[i].score);
    			write2.write("\r\n");
        	}
        	if(5592<i) {
        		String temp1 =score[i].pair1+" "+score[i].pair2;     
        		if(onlyPos.contains(temp1)) {
        			ratio++;
        		}
        		write2.write(score[i].pair1+" "+score[i].pair2+" "+score[i].score);
    			write2.write("\r\n");
        	}
        	
        } 
        write2.flush();
		write2.close();
        System.out.println("Guess Accuracy is "+ratio+"/5592");
        

    }
}