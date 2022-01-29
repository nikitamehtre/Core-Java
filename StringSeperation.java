import java.util.Scanner;

public class StringSeperation {

	public static void main(String[] args) {
		String word = "github";  
		String[] alphabets = word.split("");
		for(String seperate : alphabets){  
			System.out.println(seperate);  
			}      
	}

}
