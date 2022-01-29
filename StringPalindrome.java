import java.util.Scanner;

public class StringPalindrome {

	public static boolean isPalindrome(String str) {
		char[] ch = str.toCharArray();
		
		int len = str.length();
		int ittr = (len/2)-1;
		
		for(int i=0; i<=ittr; i++) {
			if(ch[i] != ch[len-1-i]) {
				return false;
			}
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		String userInput; 
		int wantToContinue;

		boolean con = true;
		while(con) {
			System.out.print("Enter a string: ");
			Scanner scan = new Scanner(System.in);
			userInput = scan.nextLine();

			boolean result = isPalindrome(userInput);
			if(result) {
				System.out.println("Yes!! Its palindrome");
			} else {
				System.out.println("No!! Its not palindrome");
			}
			
			System.out.print("Do you want to continue? (Enter 1 for yes, 0 for no): ");
			Scanner scan2 = new Scanner(System.in);
			wantToContinue = scan2.nextInt();
			
			if(wantToContinue == 0) {
				con = false;
			}
		}
		
		System.out.print("Thanks for using NIKKI2021 software");
	}
}
