import java.util.Scanner;

public class FactorialWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number: ");
		int num = scan.nextInt();
		int i = 1, fact=1;
		while(i<= num)
		{
			fact = fact*i;
			i++;
		}
		System.out.print("Factorial: "+fact);
		
	}

}
