package org.MUM.HumanResources;


public class Employee 
{
	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String birthDate;
	private String ssn;
	private double salary;
	Position position;
	
	
	
	public Employee(int employeeId, String firstName, String lastName,String birthDate,String ssn, double salary )
	{

		
		this.employeeId= employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.ssn = ssn;
		this.salary = salary;
	}
	//Using Delegation
	public void print()
	{
		System.out.println();
		System.out.println("***Employee: ");
		System.out.println("Id: "+employeeId+"\nFirstName:"+firstName+"\nmiddleInitial"+middleInitial+
				"\nlastName"+lastName+"\nDate of birth: "+birthDate+"\nSSN :"+ssn+"\nSalary: "+salary);
		
		System.out.println();
		
		
		System.out.println();
		
		
		
		System.out.println();
		
	
	}

	//----------------------------------------------------------------------------
	
	
	
	//getters and setters
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
