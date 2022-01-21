// Program to check the frequency of a string

import java.util.Scanner;

public class CharFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //User input values
		System.out.print("String: ");
		String str = sc.nextLine();
		int i, j;
		int[] freq = new int[str.length()]; 
		char str1[] = str.toCharArray();
		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (str1[i] == str1[j]) {
					freq[i]++;
					str1[j] = '0';
				}
			}
		}
		for (i = 0; i < freq.length; i++) {
			if (str1[i] != ' ' && str1[i] != '0')
				System.out.println(str1[i] + " " + freq[i]);
		}

	}

}
