package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWOIterator {
	 
    public static void main(String[] args)
    {
        List <Integer> list = new ArrayList <>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
 
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
