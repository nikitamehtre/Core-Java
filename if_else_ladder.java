package if_else;

import java.util.Scanner;

public class if_else_ladder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z')
			System.out.println(ch + " is lower case");
			    
		else if(ch >= 'A' && ch <= 'Z')
			System.out.println(ch + " is upper case");
				
		else if(ch >= '0' && ch<= '9')
			System.out.println(ch + " is a number");
			
		else
			System.out.println(ch + " is special symbol");

			}

}

