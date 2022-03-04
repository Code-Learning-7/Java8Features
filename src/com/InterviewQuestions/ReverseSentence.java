package InterviewQuestions;

public class ReverseSentence {
	public static void main(String args[]) {

		String Rev = "";
		String s[] = "Hi i am this".split(" ");
		for (int i = s.length - 1; i >= 0; i--) {
			Rev = Rev + s[i] + " ";
		}
		System.out.println(Rev);
	}
}