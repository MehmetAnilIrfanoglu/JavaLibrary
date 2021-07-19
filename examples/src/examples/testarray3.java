package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

@SuppressWarnings("unused")
public class testarray3 {
	public static void main(String[] args) throws IOException  {
	char[] array = new char[26];
      int index = 0;
      for (char c = 'a'; c <= 'z'; c++) {
          array[index++] = c;
      }
      String result = new String(array); // Convert to a string.
      // ... Display parts of our new string.
      System.out.println(result.startsWith("abc"));
      System.out.println(result.length());
      System.out.println(array);
      char a = array[0];
      int i = (int) a;
      System.out.println(i);
      
      
      PrintStream o = new PrintStream(new File("A.txt")); 
      
      // Store current System.out before assigning a new value 
      PrintStream console = System.out; 

      // Assign o to output stream 
      System.setOut(o); 
      System.out.println("This will be written to the text file"); 

      // Use stored value for output stream 
      System.setOut(console); 
      System.out.println("This will be written on the console!"); 
     
   }
  }


