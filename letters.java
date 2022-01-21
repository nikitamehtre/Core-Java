//Program to check entered alphabet is Vowel or Consonant
package alphabets;

import java.util.Scanner;

public class letters {

	public static void main(String[] args) {

		System.out.println("Enter an aplphabet ");
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		switch (letter)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(letter + " Letter is vowel");
                break;
            default:
                System.out.println(letter + " Letter is consonant");
                break;
		}
	}
}
			
		