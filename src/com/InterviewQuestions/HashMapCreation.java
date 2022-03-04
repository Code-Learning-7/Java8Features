package InterviewQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapCreation {

	public static void main(String args[]) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(2, 30);

		//System.out.println(map);
		
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			
				System.out.println( entry.getKey() + " : " + entry.getValue() );

			
		}

	}

}
