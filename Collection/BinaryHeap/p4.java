package p4submit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;



class Words {//keeps words
	private String word;//keeps string word
	private int count;//keeps word count
	
	Words(){};//empty constructor
	
	Words(String w,int c){// constructor with variables
		this.word =w;//set word
		this.count =c;//set count
	}
	
	public String getWord() {//getting word
		return word;//return word
	}

	public void setWord(String word) {//setting word
		this.word = word;//setted word
	}

	public int getCount() {// getting count
		return count;//reurned count
	}

	public void setCount(int count) {// set count
		this.count = count;//setted count
	}

	
	@Override
	public String toString() {//tostring fumction
		return "Words [word=" + word + ", count=" + count + "]";
	}
	
}

public class p4 {//main class
	
	
	public static void main(String[] args) throws IOException {//driver method
		
		
		Words words[] = new Words[100]; // keeps elements
		for (int i=0;i<words.length;i++) { // initialize every item
			words[i]= new Words();
		}
		BinaryHeap<String> first = new BinaryHeap<>();
		
		Scanner scan = new Scanner(Paths.get("in.dat"));// reads the first file which has the information
		
		File out_file = new File("out.dat");//creates output file
		out_file.createNewFile();//initialize file
		FileWriter write = new FileWriter(out_file);// creating file writer
		
		String fileLength = scan.nextLine();// getting file length from main file as string
		int length = Integer.parseInt(fileLength);//parsing it to integer
		String arr[]=new String[length];//keeps names for reading
		
		for(int i=0;i<arr.length;i++) {//setting words
			arr[i]=scan.nextLine();//scanned word
		}
		
		
		int place=0;//current place in word
		
		for (int j=0;j<arr.length;j++) {//transferring elements to heap
			
			String filename = arr[j];// taking input names sequentally
			Scanner sc = new Scanner(Paths.get(filename));//reads the file which comes from first scanner
			String word;//the word which will be gonna added
			while(sc.hasNext()) {//condition to continue
				
				word = sc.nextLine();//word scanned
				first.add(word);//word added
					
			}
		}
		
		String word2;//temporary word
		
		for (int k=0;k<length;k++) {//counting element numbers
			while(first.isEmpty()==false) {
				boolean found =false;//determines that element exists
				word2 = first.remove();//equals to removed element from heap
				
				for (int i=0;i<place;i++) {//organizes elements
					if (words[i].getWord().compareTo(word2)==0) {//checks if element exists
						found=true;//it exists
						words[i].setCount(words[i].getCount()+1);//increase its count
					}
				}
				if (!found) {// if element is not exists,it adds it
					words[place].setWord(word2);//add word
					words[place].setCount(1);//add count
					place++;//increase length
				}
			}
		}
		
		for (int i=0;i<place;i++) {//this is for both giving result in console and giving out.dat file
			System.out.println(words[i].getWord()+" "+words[i].getCount());
			write.write(words[i].getWord()+" "+words[i].getCount());
			write.write("\r\n");
		}
		write.flush();
		write.close();//writer closed
	}

}
