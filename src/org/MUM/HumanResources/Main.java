package org.MUM.HumanResources;


public class Main 
{

	public static void main(String[] args)
	{
		Company google = new Company("google");
	
		//Departments
		Department it = new Department("IT", "1st floor");
		google.addADepartment(it);

		Department design = new Department("Design", "2nd floor");
		google.addADepartment(design);

		//Positions
		Position manager = new Position("Manager","Managing department");
		it.addAPosition(manager);

		Position uiDesigner = new Position("uiDesigner","Designing userInterface");
		it.addAPosition(uiDesigner);

		Position graphicDesigner = new Position("graphicDesigner","Graphical Design");
		design.addAPosition(graphicDesigner);

		Position developer = new Position("developer","Developing programs");
		it.addAPosition(developer);

		//Employees
		Employee jack = new Employee(123,"Jack","Raw","12/9/1980","12345678",10000);
		graphicDesigner.setEmployee(jack);

		Employee jane = new Employee(124,"Jane","Austin","12/9/1990","12345698",7000);
		developer.setEmployee(jane);
	

		Employee hardy = new Employee(123,"Hardy","Jackson","1/23/1989","123458654",6000);
		uiDesigner.setEmployee(hardy);
		
		
		Employee tim = new Employee(1239,"Tim","Brown","1/23/1984","123458654",12000);
		manager.setEmployee(tim);
		
		
		//-------
		//manager.setSuperior(manager);
		manager.addToInferiors(uiDesigner);
		manager.addToInferiors(developer);
		uiDesigner.setSuperior(manager);
		developer.setSuperior(manager);
		//graphicDesigner.addToInferiors(uiDesigner);
		

		//Print Using delegation
		//google.print();
		
		
		//total Salary
		// google.getTotalSalary();
		manager.printDownLine(0);
	}

	//public static void print(ArrayList<Company> c)
	//{
		//for(Company company : c)
		//{
			//for(Department department : company.departments)
			//{
				//for(Position position : department.positions)
				//{
					//for(Employee employee : position.employess)
					//{
						//System.out.println("***Company: ");
						//company.print();
						//System.out.println();
						//System.out.println("***Department: ");
						//department.print();
						//System.out.println();
						//System.out.println("***Position: ");
						//position.print();
						//System.out.println();
						//System.out.println("***Employee: ");
						//employee.print();
					//	System.out.println();
						//System.out.println("----------------------------------------------");
						//System.out.println();
					//}
				//}
			//}
		//}//end of main for
		
		
	}

