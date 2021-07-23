package mehmetanilirfanoglu;

import java.util.Scanner;

public class Q1 {
	
	
	private static void permutate(String permutationString){
		
		int upperB = permutationString.length();
		Stack<Character> main1 = new ArrayStack<>();
        int [] fact = new int[permutationString.length()+1];
        
        fact[0]= 1;
        for (int i = 1; i<=permutationString.length();i++) {
            fact[i] = fact[i-1] * i;
        }
        int i=0;
        while ( i < fact[permutationString.length()]) {
            String temp = permutationString;
            int positionCode = i;
            int j=permutationString.length();
            while(j>0) {
            	if(j==1) {	
            		main1.push(temp.charAt(0));
            	}
            	else {												
            		int selected = positionCode / fact[j-1];  
                    main1.push(temp.charAt(selected));
                    positionCode = positionCode % fact[j-1]; 
                    String carry="";
                    for(int k=0;k<temp.length();k++) {
                    	if(k==selected){
                    	}
                    	else {
                    		carry+=temp.charAt(k);
                    	}
                    }
                    temp=carry;
            	}
            	j--;
            }
            
          
            int k=0;
            while(k<upperB) {
            	System.out.print(main1.pop());
            	k++;
            }
            System.out.println();
            i++;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("please insert the number that you want to enumerate: ");
		int numerate = scan.nextInt();
		String permutInit ="";
		
		int i=0;
		while(i<numerate) {
			i++;
			permutInit+=i;
		}
		permutate(permutInit);
		
		
	}

}