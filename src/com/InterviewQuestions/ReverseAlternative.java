package InterviewQuestions;

//Java implementation of the approach
class ReverseAlternative
{

//Function to return the string after
//reversing the alternate k characters
static String revAlternateK(String s,
							int k, int len)
{
	for (int i = 0; i < s.length();)
	{

		// If there are less than k characters
		// starting from the current position
		if (i + k > len)
			break;

		// Reverse first k characters
		s = s.substring(0, i) + new String(new StringBuilder(s.substring(i, i + k)).reverse()) +s.substring(i + k);

		// Skip the next k characters
		i += 2 * k;
	}
	return s;
}

//Driver code
public static void main(String[] args)
{
	String s = "java";
	int len = s.length();
	int k = 2;
	System.out.println(revAlternateK(s, k, len));
}
}

//This code is contributed by 29AjayKumar
