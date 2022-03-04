package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Java8Stream.Student;

public class StreamEx1 {

public static void main(String[] args) {
	List<Empl> emp = new ArrayList<>();
	emp.add(new Empl(1, "Maxy", 50));
	emp.add(new Empl(2, "Lucy", 48));
	emp.add(new Empl(3, "Sam", 60));

	
	
	List<Empl> list = emp.stream().filter(e -> e.getAge()>=50).sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
	list.forEach(e-> System.out.println(e));
}

	
}

class Empl {
	int id;
	String name;
	int age;
	public Empl(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Empl i2) {
		
		return this.age - i2.age;
	}

	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	}