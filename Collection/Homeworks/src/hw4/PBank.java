package hw4;

import java.util.Scanner;

public class PBank {
	public static void main(String[] args) {
		
	  Scanner scan = new Scanner(System.in);
	            
		String field[][] = new String[21][21]; 
		Mines[] mine = new Mines[21]; 
		for (int i = 0; i < 21; i++) {
		  mine[i] = new Mines((int)(Math.random() * 20) + 1,(int)(Math.random() * 20) + 1,(int)(Math.random() * 3) + 1);
			
		  field[mine[i].getY_cordinate()][mine[i].getX_cordinate()] = mine[i].mine_name;
		  
		}
		
		int thieft =(int)(Math.random() * 21) + 1;
		
		Person thief = new Thief("Thief",mine[thieft].getX_cordinate(),mine[thieft].getY_cordinate());


		 int[] index = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		 double tempVar;
		 int tempVar2;
		 String tempVar3;
		 
	        for (int i = 0; i < mine.length; i++)
	        {
	                 for(int j = 0; j < mine.length; j++)
	                 {
	                         if(mine[i].distance > mine[j].distance)
	                         {
	                         tempVar =  mine[j].distance;
	                         mine[j].distance= mine[i].distance;
	                         mine[i].distance = tempVar;
	                         
	                         tempVar2 =  index[j];
	                         index[j]= index[i];
	                         index[i] = tempVar2;
	                         
	                         tempVar3 =  mine[j].mine_name;
	                         mine[j].mine_name= mine[i].mine_name;
	                         mine[i].mine_name = tempVar3;
	                         
	                         }
	                 }
	        }
	       
	        
	        int counter =20;
	        String[] Pbank = {"","","","","","","","","","","","","","","","","","","","",""};
	        int[] deployTime = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	        int[] interest = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	        int[] stealTime = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	        int banksaving = 0;
	        int steal = 0;
	        int currentTime = 5;
	        int securityCheck = 0;
	        
		
		while (true) {
			int test;
			System.out.println("Choose One option");
			System.out.println("(1) Collect Mine");
			System.out.println("(2) Terminate");
			test = scan.nextInt();
			if(test==2) {
				break;
			}
			System.out.println("Enter deploy hour");
			int deploy = scan.nextInt();
			
			Pbank[banksaving]=mine[counter].mine_name;
			deployTime[banksaving]=deploy;
			
			switch (mine[counter].mine_name) {
			  case "silver":
				  interest[banksaving] = 1;
				  break;
			  case "gold":
				  interest[banksaving] = 2;
				  break;
			  case "diamond":
				  interest[banksaving] = 3;
				  break;
			  }
			
			System.out.println("Minimum distance = "+mine[counter].distance);
			String strDouble = String.format("%.2f",mine[counter].distance);
			System.out.println("Closest mine is "+index[counter]+" type = "+mine[counter].mine_name+" with distance = "+strDouble);
			  
			  int subSum = 0;
				for (int i=0;i<Pbank.length;i++) {
					if (Pbank[i].equals("gold") || Pbank[i].equals("diamond") || Pbank[i].equals("silver") ) {
						subSum = subSum + interest[i]+interest[i]*(currentTime-deployTime[i]);
					}
				}
			 int stopThieft = 0;
				if (30<subSum && securityCheck != 0) {
					stopThieft = 1;
				}
			  
			  if (mine[counter].distance > thief.getDistance() && stopThieft==0) {
					 
				 
				  System.out.println("The Thief is stealing "+ Pbank[steal] + " with interests = "+interest[steal]);
				  Pbank[steal]="";
				  stealTime[steal]=currentTime;
				  steal++;
				  securityCheck++;
			  }
			  
			
			  currentTime++;
			  banksaving++;
			  counter--;
			  
				 
		}
		scan.close();
		int finalSum = 0;
		for (int i=0;i<Pbank.length;i++) {
			if (Pbank[i].equals("gold") || Pbank[i].equals("diamond") || Pbank[i].equals("silver") ) {
				finalSum = finalSum + (interest[i]+interest[i]*(17-deployTime[i]));
				
			}
			else {
				if (interest[i]!= 0) {
					finalSum = finalSum + interest[i]*(stealTime[i]-deployTime[i]);
					
				}
				
			}
		}
		System.out.println("Terminated");
		System.out.println("The Primitive Bank value of "+finalSum +" Turkish Lira");
	}						 			  			
}		



