package Looping;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i = 1;
		//Post-tested loop
		do {
			System.out.println(i + "\t");
			i++;
		}while(i<= num);
		
	}
	
}
