package homework3tueasdaytest;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

class Map {
	private int x; //value
	private int y; //index
	
	Map(){} // empty constructor
	
	Map(int val,int index){ // contructor to set value and index
		x = val;
		y = index;
	}
	
	public int getX() { // setters and getters
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	};
}

public class homework3 { // main class
	
	
	 public static int[] countingSort(int[] numbers) { // counting sort algorithm
	    int max = numbers[0];
	    for (int i = 1; i < numbers.length; i++) {
	        if (numbers[i] > max)
	            max = numbers[i];
	    }

	    int[] sortedNumbers = new int[max+1];

	    for (int i = 0; i < numbers.length; i++) {
	        sortedNumbers[numbers[i]]++;
	    }

	    int insertPosition = 0;

	    for (int i = 0; i <= max; i++) {
	            for (int j = 0; j < sortedNumbers[i]; j++) {
	                    numbers[insertPosition] = i;
	                    insertPosition++;
	            }
	    }
	    return numbers;
	}
	
	
    
	public static void mainFunction(String in,String out) throws IOException {// main homework parts are here
		Map var1 = new Map(); // temp object
		Map counter1[] = new Map[500]; // set of objects in order to keep info
		for (int i=0;i<counter1.length;i++) { // initialize every item
			counter1[i]= new Map();
		}
		Scanner scanFile = new Scanner(Paths.get(in+".txt"));//file reading method
		File out_file = new File(out+".txt");
		out_file.createNewFile();
		FileWriter write = new FileWriter(out_file);// file writing method
		String size = scanFile.nextLine();
		int n = Integer.parseInt(size);// length of the main array
		
		int counter[] = new int[n];// main array
		int count5func[] = new int[n];//array for 5th part
        for (int i=0;i<n;i++) {
        	counter[i]=0;
        }	
      
		while (scanFile.hasNext()==true) {
			String line = scanFile.nextLine();
		  // ý chose functions via charat 0 to determine which function will gonna used
			if (line.charAt(0) == '0') {
				System.out.println("Exitting");
				break;
			}
			
			if (line.charAt(0) == '1') {
				write.write("print by index");
				write.write("\r\n");
				for(int i=0;i<n;i++) {
					write.write(i+" "+counter[i]);
					write.write("\r\n");
				}
				write.write("-------");
				write.write("\r\n");
			}
			
			if (line.charAt(0) == '2') {
				write.write("print by count");
				write.write("\r\n");
				
				for (int i=0;i<n;i++) {
					counter1[i].setX(counter[i]);
					counter1[i].setY(i); 
				}
				for (int i=1; i<n;i++) {
					for (int j=0;j<(n-i);j++) {
						if (counter1[j].getX() > counter1[j+1].getX()) {
							var1=counter1[j];
							counter1[j]=counter1[j+1];
							counter1[j+1]=var1;
						}
					}
				}
				for (int i=0;i<n;i++) {
					write.write(counter1[i].getY()+" "+counter1[i].getX());
					write.write("\r\n");
				}
				write.write("-------");
				write.write("\r\n");
			}
			
			if (line.charAt(0) == '3') {
				String[] temporary = new String[2];
					
	        	temporary=line.split("\\s+");
	        	int element1 = Integer.parseInt(temporary[1]);
	        	counter[element1] +=1;
			}
			
			if (line.charAt(0) == '4') {
				String[] temporary = new String[2];
					
	        	temporary=line.split("\\s+");
	        	int element1 = Integer.parseInt(temporary[1]);
	        	counter[element1] -=1;
			}
			
			if (line.charAt(0) == '5') {
				String[] temporary = new String[3];
					
	        	temporary=line.split("\\s+");
	        	int element1 = Integer.parseInt(temporary[1]);
	        	int element2 = Integer.parseInt(temporary[2]);
	        	int lower_bound = element1;
	        	int upper_bound= element2;
	
	        	for (int i=0;i<counter.length;i++) {
	        		
	        		count5func[i] = counter[i];
	        	}
	        		//Arrays.sort(count5func);
	        		countingSort(count5func);
	        		
	        		
	        		int left,right,down,up;
	        		int count1=1;
	        		int count2=-1;
	        		while(true) {
	        			down = Arrays.binarySearch(count5func, element1);
	        			if (down<0) {
	        				down = Arrays.binarySearch(count5func, element1+count1);
	        				count1++;
	        			}
	        			if(down>=0) {
	        				int value = count5func[down];
	        				  left = down;
	        				    while (left - 1 >= 0) {
	        				        if (count5func[left-1] == value) {
	        				            left--;
	        				            down=left;
	        				        }else
	        				        break;
	        				    }
	        			break;	
	        			}
	        		}
	        		while(true) {
	        			up = Arrays.binarySearch(count5func, element2);
	        			if (up<0) {
	        				up = Arrays.binarySearch(count5func, element2+count2);
	        				count2--;
	        			}
	        			if(up>=0) {
	        				int value = count5func[up];
	        				 right = up;

	        				while (right + 1 < count5func.length) {
	        			        if (count5func[right+1] == value) {
	        			            right++;
	        			            up=right;} else
	        			        break;
	        			    }	
	        			break;	
	        			}
	        		}
	        		int value = (up - down)+1;
	        		write.write(value+" counters valued between "+lower_bound+" and "+upper_bound);
					write.write("\r\n");
	        	}
			}
		write.flush();
		write.close();	
	}


	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String in, out;
		System.out.println("please write the file you want to read without txt extension: ");
		System.out.println("for example input1");
		in = scan.nextLine();
		System.out.println("please write the name of output file without txt extension: ");
		out = scan.nextLine();
		mainFunction(in,out);
		scan.close();
		
	}
}
