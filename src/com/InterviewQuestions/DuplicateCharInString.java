package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharInString {
	
	public static void main(String[] args) {
		
		String str = "yeswanth reddy";
		char[] charArr =str.toCharArray();
	
	Map<Character, Integer> map = new HashMap<>();
	for (char ch : charArr) {
		map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
	}

	// System.out.println(map);

	for (Entry<Character, Integer> entry : map.entrySet()) {
		if (entry.getValue() > 1) {
			System.out.println(
					"The  repeated number is " + entry.getKey() + " repeated " + entry.getValue() + " times");

		}
	}
}
	
}
