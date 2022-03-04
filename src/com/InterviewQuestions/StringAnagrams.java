package InterviewQuestions;

import java.util.Arrays;

public class StringAnagrams {

	
	public static void main(String[] args) {
		
		
		char[] str ="yeswanth".toCharArray();
		char[] str2 = "yeswanht".toCharArray();
		
		Arrays.sort(str);
		Arrays.sort(str2);
		
		if(Arrays.equals(str,str2)) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}

	}
}
