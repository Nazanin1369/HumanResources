package org.MUM.HumanResources;

import java.util.ArrayList;

public class Company 
{

	private String name;
	ArrayList<Department> departments = new ArrayList<Department>();

	public Company(String name)
	{
		this.name = name;
	}
	//Methods
	public void addADepartment(Department d)
	{
		d.setCompany(this);
		departments.add(d);
	}

	//------------------------------------
	public void print()
	{

		System.out.println("***Company:");
		System.out.println("Name: "+name);
		System.out.println("---------------------------------");
		for(Department department : departments)
		{
			
			System .out.println("***Department:");
			System.out.println("Name: "+department.getName()+"\n Location: "+department.getLocation());
			department.print();

		}

	}
	//--------------------------------------
	
	public void getTotalSalary()
	{
		
		double total=0;
		for(Department department : departments)
		{
			total += department.getTotalSalary();
		}

		System.out.println("Total salary is : "+ total);
		
	}
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
