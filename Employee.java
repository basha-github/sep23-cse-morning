
public class Employee {
	
	private int empId;
	private String eName;
	private float salary;
	private String orgName;
	public Employee(int empId, String eName, float salary, String orgName) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.salary = salary;
		this.orgName = orgName;
	}
	
	void calSalary() {
		if(this.salary > 10000)
		this.salary = this.salary - (this.salary * 0.1f);
		System.out.println("Final salary..."+this.salary);
	}
	
	

}
