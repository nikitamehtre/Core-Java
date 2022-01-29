import java.util.Scanner;

public class FactorialForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number: ");
		
		int num = scan.nextInt();

		int i, fact=1;  
		
		for(i=1;i<=num;i++){    
			fact=fact*i;    
		}     
		
		System.out.println("Factorial!: "+fact);  
	}

}
