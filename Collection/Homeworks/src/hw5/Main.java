package hw5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
 
public class Main
{
    public void smart_bag(int carry_limit,int items,int[] temp_weight, int[] temp_price)
    {
    	int[][] sol = new int[items + 1][carry_limit + 1];
    	int[][] main_matrix = new int[items + 1][carry_limit + 1];
        int compare_number = -10;
        for (int i = 1; i <= items; i++)
        {
            for (int j = 0; j <= carry_limit; j++)
            {
                int first_number = main_matrix[i - 1][j];
                int second_number = compare_number;        
                if (j >= temp_weight[i])	
                second_number = main_matrix[i - 1][j - temp_weight[i]] + temp_price[i];
                main_matrix[i][j] = Math.max(first_number, second_number);
                sol[i][j] = second_number > first_number ? 0 : 1;
            }
        }        
        int[] checpoint = new int[items + 1];
        for (int ite = items, carry = carry_limit; ite > 0; ite--)
        {
            if (sol[ite][carry] != 1)
            {
                checpoint[ite] = 0;
                carry = carry - temp_weight[ite];
            }
            else
                checpoint[ite] = 1;
        }
        int sum = 0;
        for (int i = 1; i < items + 1; i++) {
            if (checpoint[i] == 0) {
        		sum += temp_price[i];
            }
        }
        System.out.println(sum);

        for (int i = 1; i < items + 1; i++) {
            if (checpoint[i] == 0) {
                System.out.println(temp_weight[i]+" "+temp_price[i]+" (item "+(i-1)+")");
            }
        }
    }
    public static void main (String[] args) throws IOException 
    {
    	Scanner scan = new Scanner(Paths.get("smartbag.txt")); // input txt dosyasýný okuyacak þekilde ayarladým
        Main thief_bag = new Main();
        int weight_limit = scan.nextInt();
        int numberOfElements = scan.nextInt();
        int[] weight = new int[numberOfElements + 1];
        int[] price = new int[numberOfElements + 1];
        String [] temporary =new String[2];
        scan.nextLine();
        for (int l = 1;l<=numberOfElements;l++){
        	String line = scan.nextLine();	
        	temporary=line.split("\\s+");
        	String str = temporary[0];
        	String str2 = temporary[1];
        	int i = Integer.parseInt(str);
        	int j = Integer.parseInt(str2);
        	weight[l]= i;
        	price[l]= j;
        }
        thief_bag.smart_bag(weight_limit, numberOfElements,weight,price);
        scan.close();
    }
}
