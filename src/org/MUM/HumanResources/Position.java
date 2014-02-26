package org.MUM.HumanResources;

import java.util.ArrayList;

public class Position 
{
	private String title;
	private String description;
	Department department;
	Employee employee;

	//Reflexive association
	Position superior ;
	ArrayList<Position> inferiors = new ArrayList<Position>(); 


	public Position(String title, String description)
	{
		this.title = title;
		this.description = description;
	}
	//Methods
	public void print()
	{
		System.out.println("***Position: ");
		System.out.println("Title: "+title+"\nDescription: "+description+"\nDepartment: "+department.getName());
		employee.print();

	}

	
	//---------------------------------
	public void addToInferiors(Position p )
	{
		inferiors.add(p);
	}

	//-----------------------------------

	public double getTotalSalary()
	{
		return employee.getSalary();

	}

	//-------------------------------------------------

	public boolean isManager()
	{
		if(this.title.equals("manager"))
			return true;
		else
			return false;
	}

	//----------------------------------------------------


	public void printDownLine( int level )
	{
	
	level = level + 1;
		String indent = "  "; 
    for(int i = 0; i < level; i++) {
	indent += indent;}
	Employee emp = employee;

		System.out.println("Title: "+title+"\nDescription: "+description+"\nDepartment: "+department.getName() );
		
		if(emp != null)
		{
		
		
	System.out.println(indent + "Id: " + emp.getEmployeeId()+
				indent+"middleInitial" +  emp.getMiddleInitial()+
				indent+"lastName" + emp.getLastName()+
				indent+"Date of birth: "+emp.getBirthDate()+
				indent+"SSN :"+ emp.getSsn()+
			indent+"Salary: "+ emp.getSalary());
		}
		
		if(! inferiors.isEmpty())
		{	
			for(Position position : inferiors)
			{
				Employee em = position.getEmployee();
				 
				  if(em == null)
				  {
					  return;
				  }
				  position.printDownLine( level);
				
			}
		}
		else
		{
			System.out.println("No inferior!");
		}
	}
	
//	public void printDownLine(){
//		System.out.println(title);
//		for (Position o : inferiors) {
//			System.out.println(" ");
//			o.printDownLine();
//		}
//	}

	public boolean isSuperioir()
	{
		if(this.getTitle().equals("manager"))
			return true;
		else 
			return false;
	}

	//getters and setters
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		employee.setPosition(this);
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public Position getSuperior() {
		return superior;
	}
	public void setSuperior(Position superior) {
		this.superior = superior;
	}
	public ArrayList<Position> getInferiors() {
		return inferiors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setInferiors(ArrayList<Position> inferiors) {
		this.inferiors = inferiors;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDecsription() {
		return description;
	}

	public void setDecsription(String decsription) {
		this.description = decsription;
	}


}
