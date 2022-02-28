package com.java8.stream.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(Employee :: getGender,Collectors.counting()));    
		System.out.println(genderCount);
		
		//Print all department names
		Stream<String> departmentList = employeeList.stream().map(Employee :: getDepartment);//map is a intermediate method
		departmentList.forEach(System.out::println); // print stream 
		
		//Average age of male and female employees
		Double avgAge =employeeList.stream().collect(Collectors.averagingInt(Employee :: getAge));
		System.out.println(avgAge);
		
		//Average age of male and female seperately
		Map<String,Double> averageAge =employeeList.stream().collect(Collectors.groupingBy(Employee :: getGender,Collectors.averagingInt(Employee :: getAge)));
	    System.out.println(averageAge);
	    
	    //Get the details of highest paid employee
	    //Optional<Employee> highsalary = employeeList.stream().max((e1,e2) -> e1.getSalary() >e2.getSalary()?1:-1);	
	    Optional<Employee> highestSal=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));
	    System.out.println("highestSal :" +highestSal.get());
	   
		//get the names all employees who have joined after 2015
	    employeeList.stream().filter(y -> y.getYearOfJoin() >2015).map(Employee :: getName).forEach(System.out :: println);
	   
	    //count the number of employees in each department
	    Map<String, Long> totalEmp =employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment,Collectors.counting()));
	    //Set<Entry<String, Long>> total =totalEmp.entrySet();
	    for (Entry<String, Long> entry : totalEmp.entrySet()) {
			
	    	System.out.println(entry.getKey()+":"+entry.getValue());
		}
	    
	    //what is the average salary of each department
	    Map<String,Double> avgSal =employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.averagingDouble(Employee :: getSalary)));
	   Set<Entry<String, Double>> totalAvgSal= avgSal.entrySet();
	   for (Entry<String, Double> entry : totalAvgSal) {
		   System.out.println(entry.getKey()+":"+entry.getValue());
	   }
	      
	  employeeList.stream().filter(a ->a.getAge() >20).map(a -> a.getAge()*2).forEach(System.out :: println);;
	  
	  //Get the details of youngest male employee in the product development department
     Optional<Employee> youngMale = employeeList.stream().filter(d ->d.getDepartment() == "Product Development" & d.getGender()=="Male").collect(Collectors.minBy(Comparator.comparing(Employee :: getAge)));
	     System.out.println(youngMale.get());
	  
	  //Who has the most working experience in the organization?
	  Optional<Employee>  mostEx = employeeList.stream().sorted((y1,y2) ->y1.getYearOfJoin()>y2.getYearOfJoin()?1:-1).findFirst();
	  Optional<Employee>  mostEx1 =employeeList.stream().sorted(Comparator.comparing(Employee :: getYearOfJoin)).findFirst();
	       System.out.println(mostEx.get());
	       System.out.println(mostEx1.get());
	  
	   //How many male and female employees are there in the sales and marketing team?
	   Map<String,Long> empCount= employeeList.stream().filter(d ->d.getDepartment() =="Sales And Marketing").collect(Collectors.groupingBy(Employee :: getGender ,Collectors.counting()));
	     System.out.println(empCount);
	  
	    // What is the average salary of male and female employees?
	       Map<String, Double> avgSal1 = employeeList.stream().collect(Collectors.groupingBy(Employee ::getGender , Collectors.averagingDouble(Employee :: getSalary)));
	              System.out.println(avgSal1);
	  
	    // List down the names of all employees in each department?
	       Map<String, List<Employee>> allEmp = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
	       System.out.println(allEmp);
	       Set<Entry<String, List<Employee>>> a = allEmp.entrySet();
	       for (Entry<String, List<Employee>> entry : a) {
			  
	    	  System.out.println(entry.getKey()+":");
	    	  List<Employee> e =entry.getValue();
	    	  for (Employee emp : e) {
				System.out.println(emp.getName());
			}
		}
	  
	       //What is the average salary and total salary of the whole organization?
	      Double avgSal2 =employeeList.stream().collect(Collectors.averagingDouble(Employee :: getSalary));
	      Double totSal2 =employeeList.stream().collect(Collectors.summingDouble(Employee :: getSalary));
	     DoubleSummaryStatistics summarize = employeeList.stream().collect(Collectors.summarizingDouble(Employee ::getSalary));
	      System.out.println("Average Salary:"+avgSal2);
	      System.out.println("Total Salary:"+totSal2);
	      System.out.println("Total Salary:"+summarize.getSum());
	      System.out.println("Average Salary:"+summarize.getAverage());
	  
	      //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
	      
	      List<Employee> young=employeeList.stream().filter(an ->an.getAge()<=25).collect(Collectors.toList());
	      List<Employee> elder =employeeList.stream().filter(ab ->ab.getAge()>25).collect(Collectors.toList());
	      System.out.println("YoungerEmployees:"+young);
	      System.out.println("OlderEmployees:"+elder);
	  
	     Map<Boolean, List<Employee>> yo = employeeList.stream().collect(Collectors.partitioningBy(an ->an.getAge()<=25));
	     
	    Set<Entry<Boolean, List<Employee>>> entry= yo.entrySet();
	    for (Entry<Boolean, List<Employee>> entry2 : entry) {
			
	    	if(entry2.getKey())
	    	{
	    		System.out.println("Employees younger than 25 years");
	    	}
	    	else
	    	{
	    		System.out.println("Employees older than 25 years");
	    	}
	    	
	    	List<Employee> ee =entry2.getValue();
	    	for (Employee em : ee) {
				System.out.println(em.getName());
			}
		}
	    
	    //Who is the oldest employee in the organization? What is his age and which department he belongs to?
	    
	    Optional<Employee> old =employeeList.stream().max(Comparator.comparing(Employee :: getAge));
	    Employee older =old.get();
	   System.out.println("Age of the Older Employee:"+older.getAge());
	   System.out.println("Department of older employee"+older.getDepartment());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
