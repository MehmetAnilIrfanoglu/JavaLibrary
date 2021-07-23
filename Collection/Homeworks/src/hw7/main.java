package hw7;


import java.util.*;
public class main {
   public static void main(String[] args) {
	  
       String binaryNum;
       BinaryWord word, comp;
       
      
       Collection<RGBColor> colorList = new ArrayList<RGBColor>();
       Collection<PositiveInteger> intList = new ArrayList<PositiveInteger>();
       PositiveInteger  posIntSum;
      
       Scanner scan = new Scanner(System.in);
      
       System.out.println("Enter binary number: ");
       binaryNum = scan.next();
       word = new BinaryWord(binaryNum);
       comp = word.complement();
      
       System.out.println("original binary number:"+ word+", changed binary number is "+comp);
       
       System.out.println("number of integer you want to sum: ");
       int number_of_integers = scan.nextInt();
     
       for (int i=0;i<number_of_integers;i++) {
    	   System.out.println("please enter number: ");
    	   int temp = scan.nextInt();
    	   PositiveInteger temp2 = new PositiveInteger(temp);
    	   intList.add(temp2);
       }
      
      
       posIntSum = PositiveInteger.combine(intList);
      
       System.out.println("sum of numbers is "+posIntSum.getPos_int());
      
       int red1, green1, blue1, red2, green2, blue2, red3, green3, blue3,red4,green4,blue4;
       RGBColor color1, color2,color3,color4, mix, colorCombo;
       
       System.out.println("insert value of red,green and blue for color1");
       red1 = scan.nextInt();
       green1 = scan.nextInt();
       blue1 = scan.nextInt();
       
       System.out.println("insert value of red,green and blue for color2");
       red2 = scan.nextInt();
       green2 = scan.nextInt();
       blue2 = scan.nextInt();
       
      
       color1 = new RGBColor(red1, green1, blue1);
       color2 = new RGBColor(red2, green2, blue2);
       mix = color1.operator(color2);
      
       System.out.println("Mix of colors 1, 2 RGB: "+ mix.getRed()+" "+ mix.getGreen()+" "+ mix.getBlue());
      
       System.out.println("insert value of red,green and blue for color3");
       red3 = scan.nextInt();
       green3 = scan.nextInt();
       blue3 = scan.nextInt();
      
       color3 = new RGBColor(red3, green3, blue3);
       colorList.add(color1);
       colorList.add(color2);
       colorList.add(color3);
       colorCombo = RGBColor.combine(colorList);
      
       System.out.println("mix of 1, 2 and 3 RGB: "+ colorCombo.getRed()+" "+ colorCombo.getGreen()+" "+ colorCombo.getBlue());
       
       
       System.out.println("insert 3 number in format of RGB for complementation: ");
       red4 = scan.nextInt();
       green4 = scan.nextInt();
       blue4 = scan.nextInt();
       color4 = new RGBColor(red4, green4, blue4);
       System.out.println("complemented color is in format of RGB: "+color4.complement().getRed()+" "+color4.complement().getGreen()+" "+color4.complement().getBlue());
       
       scan.close();
      
       
   }
}
