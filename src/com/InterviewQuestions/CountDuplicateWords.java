package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateWords {
	public static void main(String args[]) {

		String s[] = "Hi Hi i i am this".split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (String str : s) {

			map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);

		}
		for (Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println("The String " + entry.getKey() + " is repeated " + entry.getValue() + " " + "Times");
			}

		}
	}
}