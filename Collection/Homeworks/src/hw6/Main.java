package hw6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrli = new ArrayList<Integer>();
		ArrayList<Double> averages = new ArrayList<Double>();

		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(Paths.get("weather.txt"));
			int month = 1;
			File out_file = new File("output.txt");
			out_file.createNewFile();
			FileWriter write = new FileWriter(out_file);
			
			
			while (scan.hasNextLine()) {
				int s = scan.nextInt();
				String[] temporary = new String[s];
				String line = scan.nextLine();	
	        	temporary=line.split("\\s+");
	        	
	        	
	        	for (int i = 1; i<=s;i++) {
	        		//System.out.println(temporary[i]);
	        		int temp = Integer.parseInt(temporary[i]);
	        		arrli.add(temp);
	        	}
	        	
				int sum = 0;
				for (int i = 0; i<arrli.size();i++) {
					sum += arrli.get(i);
					
				}
				
				double average =(double) sum /(double) arrli.size();
				averages.add(average);
				
				int above = 0;
				for (int i =0;i<arrli.size();i++) {
					if (arrli.get(i)>average) {
						above++;
					}
					else {
						
					}
				}
				System.out.println("Month "+month+" average temperature: "+average);
				System.out.println(above+" days were above average temperature");
				System.out.println();
				
				write.write("Month "+month+" average temperature: "+average);
				write.write("\r\n");
				write.write(above+" days were above average temperature");
				write.write("\r\n");
				write.write("\r\n");
				
				
				
	        		arrli.clear();
	        	
				month++;
			}
			int count = 0;
			double year_average=0;
			for (int i = 0; i<averages.size();i++) {
				year_average += averages.get(i);
			}
			double total_average = year_average/12;
			
			for (int i=0;i<averages.size();i++) {
				if (averages.get(i)>total_average) {
					count++;
				}
				else {
					
				}
			}
			System.out.println("Average temperature for the year: "+total_average);
			System.out.println(count+" months were above average temperature");
			
			write.write("Average temperature for the year: "+total_average);
			write.write("\r\n");
			write.write(count+" months were above average temperature");
			write.write("\r\n");
			write.write("\r\n");
			
			write.flush();
			write.close();
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("There is something wrong");
			e.printStackTrace();
		}
		
		
		
	}

}
