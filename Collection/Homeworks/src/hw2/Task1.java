package hw2;

import java.io.*;
import java.util.Scanner;
public class Task1 {
	
	
	public static void count_letters(String input_file, String output_file) 
			throws IOException{
		char[] alphabet = new char[26];
		int index = 0;
        for (char j = 'a'; j <= 'z'; j++) {
            alphabet[index++] = j;
        }
		int[] counter= new int[26]; 
		String fileName =  input_file + ".txt";
		File textFile = new File(fileName);
		Scanner in_scan = new Scanner(textFile);
		
		while (in_scan.hasNextLine()){
            String line = in_scan.nextLine();
            String[] temp_word = null;
            temp_word = line.split(" ");
            
            for (int i = 0; i < temp_word.length; i++) {
            	
            	char[] letter = temp_word[i].toLowerCase().toCharArray(); 
                for (int j = 0; j < letter.length; j++) { 
                	for (int j2 = 0; j2 < alphabet.length; j2++) {
						if(alphabet[j2] == letter[j]) {
							counter[j2]++;
						}
					}
                } 
			}
        }
		in_scan.close();
		
		File out_file = new File(output_file + ".txt");
		out_file.createNewFile();
		FileWriter write = new FileWriter(out_file);
		
		for (int i = 0; i < alphabet.length; i++) {
				
			write.write(alphabet[i] + " " + counter[i]);
			write.write("\r\n");
		}
		
		write.flush();
		write.close();
		
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i] + " " + counter[i]);
	}
		
}

	public static void main(String[] args) throws IOException{
		count_letters("task1_1", "out1_1");

	}

}
