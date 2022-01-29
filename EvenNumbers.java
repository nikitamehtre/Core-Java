import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		int r, temp, count = 0;
		
		temp = num;
		while(temp>0) {
			temp = temp/10;
			count++;
		}
	
		while(num>0) {
			r = num%10;
			if(r%2 == 0){
				
				System.out.print(r);
			}
			num = num/10;
//			count++;
		
	}
				
	}
}