// is Relationship
// has RelationShip

public class IBMEmp extends Person {

	float salary;
	String dept;
	String city;
	Address perAddress;
	
	
	public IBMEmp(int aadhar, String name, 
			String phoneNo, float salary,
			String dept, String city,
			String street, String flatNo, 
			String dist, String state, String country) {
		super(aadhar, name, phoneNo);
		this.salary = salary;
		this.dept = dept;
		this.city = city;
		perAddress = new Address(street, flatNo, 
				dist, state, country);
	}
	
	
	
	

}
