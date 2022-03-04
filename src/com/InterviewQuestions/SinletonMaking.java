package InterviewQuestions;

public class SinletonMaking{

public static void main( String args[]){

	SinletonMaking1 d = SinletonMaking1.getIns();
	SinletonMaking1 d1 = SinletonMaking1.getIns();

	System.out.println(d.hashCode());
	System.out.println(d1.hashCode());
}
}

 class SinletonMaking1{

private static SinletonMaking1 sinletonMaking1;

private SinletonMaking1(){

}

public static SinletonMaking1 getIns() {

	if(sinletonMaking1 == null){
		sinletonMaking1 = new SinletonMaking1();
}
	return sinletonMaking1;
}

}
