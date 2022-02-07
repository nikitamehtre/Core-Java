package alphabets;

import java.util.HashMap;

public class anagram {

	public static void main(String[] args) {
		
		String a = "anagram";
		String b = "gramana";
		int n= a.length();
		
		if(a.length() != b.length()) {
			System.out.println("No");
			return;
		}
		
		HashMap<Character, Integer> count_a = new HashMap<>();
		HashMap<Character, Integer> count_b = new HashMap<>();
		
		for(int i=0; i<n; i++ ) {
			char x = a.charAt(i);
			
			if(count_a.get(x) != null) {
				count_a.put(x, count_a.get(x) + 1);
			} else {
				count_a.put(x, 1);
			}
		}
		
		for(int i=0; i<n; i++ ) {
			char x = b.charAt(i);
			
			if(count_b.get(x) != null) {
				count_b.put(x, count_b.get(x) + 1);
			} else {
				count_b.put(x, 1);
			}
		}
		
		
		for (char x : count_a.keySet()) {
			if(count_a.get(x) != count_b.get(x)) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("Yes");
	}
}
