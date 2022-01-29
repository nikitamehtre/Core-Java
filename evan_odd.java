import java.util.Scanner;

public class evan_odd {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2 == 0)
			System.out.println(num + " is Even Number");
		else if(num%2 != 0)
			System.out.println(num + " is Odd Number");
		else 
			System.out.println(" Enter another Number");	
	}

}
