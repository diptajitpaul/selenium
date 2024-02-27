package org.Java1;

public class Hyundai extends Car {


	public String model="Eon";
	
	public void getCarModel()
	{
		
		setWheelsSize(160);
		setCarLength(3);
		setCarColor("Silver");
		setMaxSpeed(110);
	
		System.out.println("Model: "+model);
		System.out.println("Car Length: "+getCarLength());
		System.out.println("Wheel Size: "+getWheelsSize());
		System.out.println("Max Speed: "+getMaxSpeed());
		System.out.println("Color: "+getCarColor());
		
	}
	
	@Override
	public void onRoadPrice()
	{
		System.out.println("Onroad price is Rs.300000");
	}
	
	public void numberOfWheels()
	{
	System.out.println("Calling Hyundai class method");
	}
}
