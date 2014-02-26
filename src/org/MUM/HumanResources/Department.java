package org.MUM.HumanResources;

import java.util.ArrayList;

public class Department 
{
	private String name;
	private String location;
	Company company;
	ArrayList<Position> positions = new ArrayList<Position>();

	public Department(String name, String location)
	{
		this.name = name;
		this.location = location;
	}

	public void print()
	{
		//System.out.println("Name: "+name+"\n Location: "+location);

		for(Position position : positions)
		{
			position.print();

		}
	}

	//-------------------------------------


	public void addAPosition(Position d)
	{
		d.setDepartment(this);
		positions.add(d);
	}
	//--------------------------------------\

	public double getTotalSalary()
	{

		double tp=0;
		for(Position p : positions)
		{
			tp += p.getTotalSalary();
		}
		return tp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}


}
