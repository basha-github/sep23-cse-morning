
class Student{

	private int rollNo;
	private String name;
	private String dept;
	private String collegeName;
	private String phoneNo;
	
	
	
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", \n name=" + name + ", \n dept=" + dept + ", \n collegeName=" + collegeName
				+ ", \n phoneNo=" + phoneNo + "]";
	}
	
	Student(int rollNo,
			String name,
			String dept,
			String collegeName,
			String phoneNo){
		
		System.out.println("Object got created");
		
		this.collegeName = collegeName;
		this.dept = dept;
		this.name = name;
		this.phoneNo = phoneNo;
		this.rollNo = rollNo;
		
	}
	
	
	
	
	
	
	
}



public class ClassDemo {

	public static void main(String[] args) {

		Student ramu = new Student(123, "Ramu","CSE", 
				"Avanthi", "9845098450");
		ramu.setRollNo(567);
		
	System.out.println(ramu.getDept());	
		
		
		
		
		
		
		
	}

}

