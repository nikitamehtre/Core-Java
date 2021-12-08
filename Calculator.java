import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a, b, add, sub, multi, div, mod;
				
		System.out.print("Enter first number:");
		a = scanner.nextInt();
		System.out.print("Enter second number:");
		b = scanner.nextInt();
				
		add = a+b;
		sub = a-b;
		multi = a*b;
		div = a/b;
		mod = a%b;
				
		System.out.println("Addtion of two variables=" + add);
		System.out.println("Substraction of two variables=" + sub);
		System.out.println("Multiplication of two variables=" + multi);
		System.out.println("Division of two variables=" + div);
		System.out.println("Modulus of two variables=" + mod);
				
				
				
				
				

		}

}


