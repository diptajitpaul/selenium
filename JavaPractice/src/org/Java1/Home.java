package org.Java1;

import org.Aggregation.*;

public class Home {

	public static void main(String[] args) {

		/*Maruti m1=new Maruti();
		m1.superClassMethod();
		m1.carMake();
		m1.onRoadPrice();
		
		
		Car m2=new Maruti();
		//m2.carMake();
		m2.onRoadPrice(); */
		
		//Car m3=new Car();
		
//		Address address1=new Address("Delhi","Delhi","India");
//		Address address2=new Address("Mumbai","Maharashtra","India");
//		
//		Employee e1=new Employee(3433,"Rahul","Engineer",address1);
//		Employee e2=new Employee(6455,"Dilip","Trainee",address2);
//		
//		e1.dispEmp();
//		e2.dispEmp();
		
		//Vehicle obj1=new Maruti();
		//obj1.vehicleClassMethod();
		
		//countWordsInAString();
		arrayManupulation();

	

	}
	
	
public static void countWordsInAString()
{
String name="Diptajit Paul";

int length=name.length();
int counter=1;

for(int i=0;i<length;i++)
{
if(name.charAt(i)==' ' && name.charAt(i+1)!=' ')
{
		counter++;
}
}

System.out.println("Number of words in the string- "+counter);

}


public static void arrayManupulation()
{
	
int[] arr1 = new int[5];
arr1[0]=5;
arr1[1]=4;
arr1[2]=3;
arr1[3]=2;
arr1[4]=1;

System.out.println(arr1[4]);



}

}
