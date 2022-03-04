package InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

class SetToList {
	public static void main(String[] args) {

		// Creating a hash set of strings
		Set<String> s = new LinkedHashSet<String>();
		s.add("Geeks");
		s.add("for");
		System.out.println(s);
		
		int n = s.size();
		List<String> aList = new ArrayList<>(n);
		for (String x : s)
			aList.add(x);

		System.out.println("Created ArrayList is");
		for (String x : aList)
			System.out.println(x);

		//Using Streams
		
		List<String> list = s.stream().collect(Collectors.toList());
		System.out.println(list);
	}
}
