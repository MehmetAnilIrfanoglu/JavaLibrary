package hw3;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class H3Main {
	public static void compute_volume(String filename) throws IOException {
		  
		Scanner scan = new Scanner(Paths.get(filename + ".txt"));
	
        while (scan.hasNextLine()){
        	 String line = scan.nextLine();
        	 String[] temp_word = null;
             temp_word = line.split(",");
             
             String shape_name = temp_word[0];
             int number1 = Integer.parseInt(temp_word[1]);
          
           
        switch (shape_name) {
        case "Cube":
         Cube cu = new Cube(shape_name,number1);
         cu.computeVolume();
            break;
        case "Cylinder":
        	int number_cy = Integer.parseInt(temp_word[2]);
        	Cylinder cy = new Cylinder(shape_name,number1,number_cy);
        	cy.computeVolume();
        	break;
        case "Cone":
        	int number_co = Integer.parseInt(temp_word[2]);
        	Cone co = new Cone(shape_name,number1,number_co);
        	co.computeVolume();
        	break;
        case "RectangularPrism":
        	int number_rec2 = Integer.parseInt(temp_word[2]);
        	int number_rec3 = Integer.parseInt(temp_word[3]);
        	RectangularPrism rec = new RectangularPrism(shape_name,number1,number_rec2,number_rec3);
        	rec.computeVolume();
        	break;
        case "TriangularPrism":
        	int number_tri2 = Integer.parseInt(temp_word[2]);
        	TriangularPrism tri = new TriangularPrism(shape_name,number1,number_tri2);
        	tri.commputeVolume();
        	break;
        case "ParallelogramPrism":
        	int number_pal2 = Integer.parseInt(temp_word[2]);
        	ParallelogramPrism pal = new ParallelogramPrism(shape_name,number1,number_pal2);
        	pal.computeVolume();
        	break;
        }
             

    }
         scan.close(); 
	}
   public static void main(String[] args) throws IOException {
	   compute_volume("input-1");
	  
	   
   }

}
