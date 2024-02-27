package org.Aggregation;

public class Employee {
	
	public String name;
	public int empId;
	public String designation;
	public Address address;
	
	public Employee(int empId,String name,String designation,Address address)
	{
		this.name=name;
		this.empId=empId;
		this.designation=designation;
		this.address=address;
		
	}
	
	public void dispEmp()
	{
		System.out.println("Employee ID:"+empId);
		System.out.println("Name:"+name);
		System.out.println("Designation:"+designation);
		System.out.println("City:"+address.city);
		System.out.println("State:"+address.state);
		System.out.println("Country:"+address.country+"\n");
		
	}
	

}
