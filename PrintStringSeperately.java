import java.util.Scanner;

public class PrintStringSeperately {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String ip = scan.nextLine();
		
		String[] iparray = ip.split(" ");
		for(int i = 0; i<iparray.length; i++){
			String part = iparray[i];
			String[] part_array = part.split("");
			String op = "";
			
			for(int j = 0; j<part_array.length; j++){
				if(j==0) {
					op += part_array[j].toUpperCase();
				} else {
					op += part_array[j].toLowerCase();
				}
			}
			
			System.out.println("Seperated Strings are: " +op);
		}
	}

}
