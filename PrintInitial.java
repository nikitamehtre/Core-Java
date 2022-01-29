
public class PrintInitial {
	static void printInitial(String name)
    {
        if (name.length() == 0)
            return;
        String words[] = name.split(" ");
        for(String word : words) {
            System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
        }
    }
 

	public static void main(String[] args) {
		String name = "John Doe";  
		printInitial(name);

	}

}
