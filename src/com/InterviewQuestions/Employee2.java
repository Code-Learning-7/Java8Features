package InterviewQuestions;

public class Employee2 {
	
	private int empId;
	private String empName;
	private int deptId;
	private String deptName;
	private String status ="active";
	private int salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee2(int empId, String empName, int deptId, String deptName, String status, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.deptName = deptName;
		this.status = status;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", deptName=" + deptName
				+ ", status=" + status + ", salary=" + salary + "]";
	}
	
	
}
	
	


