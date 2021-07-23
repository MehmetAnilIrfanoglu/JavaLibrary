package mehmetanilirfanoglu;

import java.util.Scanner;

public class Q3 {

    public static void stackTransfer(Stack<Integer> S, Stack<Integer> T)
    {
        while(true)
        {
        	if (!S.isEmpty()==false)break;
            int t_element = S.pop();
            T.push(t_element);
        }
    }
   
    public static void main(String[] args){
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        Stack<Integer> S = new ArrayStack<Integer>();
        Stack<Integer> T = new ArrayStack<Integer>();
        
        System.out.println("How many numbers you gonna push into Stack S ?");
        int length = scan.nextInt();
        int pushed_element;
        System.out.println("please insert numbers by one by");
        for (int i=0;i<length;i++) {
        	pushed_element = scan.nextInt();
        	S.push(pushed_element);
        }
        stackTransfer(S, T); // s is original , t is the stack after transfer
        System.out.println("**********************");
        System.out.println("below part belongs to stack T after transfer");
        while(true) {
        	if (!T.isEmpty()==false)break;
        	int sout = T.pop();
            System.out.println(sout);
        }
    }
}
