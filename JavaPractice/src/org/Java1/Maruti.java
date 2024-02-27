package org.Java1;

public class Maruti extends Car {

	public String model="Dzire";

	
	public void getCarModel()
	{
		
		setWheelsSize(200);
		setCarLength(4);
		setCarColor("Red");
		setMaxSpeed(150);
		
		System.out.println("Model: "+model);
		System.out.println("Car Length: "+getCarLength());
		System.out.println("Wheel Size: "+getWheelsSize());
		System.out.println("Max Speed: "+getMaxSpeed());
		System.out.println("Color: "+getCarColor());
		
	}
	
	public void carMake()
	{
		System.out.println("This is of Maruti make");
	}
	
	@Override
	public void onRoadPrice()
	{
		System.out.println("Onroad price is Rs.500000");
	}
	
	public void numberOfWheels()
	{
	System.out.println("Calling Maruti class method");
	}
	
}
