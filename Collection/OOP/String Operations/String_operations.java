package lab2;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

@SuppressWarnings("unused")
public class Lab2{
	
	//Print given string vertically
	public static void printVertical(String str){
		if (str != null){
			for(int i=0; i<str.length(); i++){
				System.out.println(str.charAt(i));
			}
		}
	}
	
	//String to char versions
	public static void stringToChar(String str) {
		char[] chars = str.toCharArray();
		System.out.println(chars.length);
		
		//char at specific index
		char c = str.charAt(2);
		System.out.println(c);
		
		//Copy string characters to char array
		char[] chars1 = new char[7];
		//getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
		str.getChars(0, 7, chars1, 0);
		System.out.println(chars1);
	}
	
	public static int countCharInString(String str, char c) {
		int count = 0;
		char[] chars = str.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(chars[i] == c) count++;
		}
		return count;
	}
	
	//Remove given characters from given string
	public static String removeChar(String str, char c) {
        if (str == null)
            return null;
        String result = str.replaceAll(Character.toString(c), "");
        System.out.println("New string is: " + result);
        return result;
    }

	//Check if given string is a palindrome using StringBuilder
	public static boolean isPalindrome(String str) {
	    if (str == null)
	        return false;
	    StringBuilder strBuilder = new StringBuilder(str);
	    strBuilder.reverse();
	    Boolean check = strBuilder.toString().equals(str);
	    System.out.println(check + ": " + strBuilder.toString());
	    return check;
	}
	
	//Check if given string is a palindrome using for loop
	public static boolean isPalindromeString(String str) {
	    if (str == null)
	        return false;
	    str = str.toUpperCase();
	    Boolean check = true;
	    int length = str.length();
	    System.out.println(length / 2);
	    for (int i = 0; i < length / 2; i++) {
	        if (str.charAt(i) != str.charAt(length - i - 1)) {
	        	System.out.println(!check + ": " + str);
	            return !check;
	        }
	    }
	    System.out.println(check + ": " + str);
	    return check;
	}
	
	public static boolean isAnagram(String word, String anagram){
		if(word.length() != anagram.length()){ 
			return false; 
		} 
		char[] chars = word.toCharArray();
		for(char c : chars){
			int index = anagram.indexOf(c);
			if(index != -1){ 
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
			}
			else{ 
				return false;
			} 
		}
		return anagram.isEmpty(); 
	}
	
	public static void printColorUsingIf(String color) {
		if(color != null) {
			if (color.equals("blue")) {
				System.out.println("BLUE");
			} else if (color.equals("red")) {
				System.out.println("RED");
			} else {
				System.out.println("INVALID COLOR CODE");
			}
		}
	}
	
	public static void printColorUsingSwitch(String color) {
		if(color != null) {
			switch (color) {
			case "blue":
				System.out.println("BLUE");
				break;
			case "red":
				System.out.println("RED");
				break;
			default:
				System.out.println("INVALID COLOR CODE");
			}
		}
	}
	
	public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }
    
    public static Boolean containsString(String str, String s) {
    	Boolean check = false;
    	if(str.length() < s.length()) {
    		return false;
    	}
    	else {
    		/*int start = 0;
    		for(int i=0;i<str.length();i++) {
    			if(str.charAt(i) == s.charAt(0)) {
    				start = i;
    				break;
    			}
    		}
    		String s2 = str.substring(start, s.length()+1);
    		System.out.println(s2);
    		if(s.equals(s2)) check = true;*/
    		for(int i = 0 ; i<str.length(); i++) {
    			
    			if(str.substring(i,i+s.length()).equals(s)) {
    				
    				check = true;
    				break;
    			}
    		}
    	}
    	return check;
    }
    
    public static char highestOccurence(String str) {
    	HashMap<String, Integer> characters = new HashMap<String, Integer>();
    	for(int i=0;i<str.length();i++) {
    		if(characters.containsKey(Character.toString(str.charAt(i)))) {
    			int num = characters.get(Character.toString(str.charAt(i)));
    			num++;
    			characters.put(Character.toString(str.charAt(i)), num);
    		}
    		else characters.put(Character.toString(str.charAt(i)), 1);
    	}
    	String result = "";
    	int max = 0;
    	Iterator<Entry<String, Integer>> it = characters.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) it.next();
			if (pair.getValue() > max) {
				max = pair.getValue();
				result = pair.getKey();
			}
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
    	
    	return result.charAt(0);
    }
	
	public static void main(String [] args) {
		//Scanner scanner = new Scanner(System.in);
		String str = "12345eee54321";//scanner.nextLine();
		
		//printVertical(str);
		//isPalindrome(str);
		//isPalindromeString(str);
		//String st = removeChar(str, 'e');
		//isPalindromeString(st);
		//stringToChar(str);
		
		//printColorUsingSwitch("red");
		//printColorUsingIf("red");
		
		//printColorUsingSwitch("RED");
		
		
		/*String s = "AAC";
        String s1 = "ABC";
        String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
        
        System.out.println(s1 == s2);*/
		
		//System.out.println(isAnagram("ali", "ila"));
		//System.out.println(countCharInString("ccccccc", 'c'));
		//scanner.close();
        
        //System.out.println(containsString("122345", "234"));
		
		System.out.println(highestOccurence("aaaaaaa11111ffff555"));
	}
	
}
