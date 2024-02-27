package org.Java1;

public abstract class Car extends Vehicle {
	
	private int wheelsSize;
	private double length;
	private String color;
	private double maxSpeed;
	
	
	public int getWheelsSize()
	{
		return wheelsSize;
	}
	public void setWheelsSize(int wheelsSize)
	{
		this.wheelsSize=wheelsSize;
	}
	
	public double getCarLength()
	{
		return length;
	}
	public void setCarLength(double length)
	{
		this.length=length;
	}
	
	public double getMaxSpeed()
	{
		return maxSpeed;
	}
	public void setMaxSpeed(double maxSpeed)
	{
		this.maxSpeed=maxSpeed;
	}
	
	
	public String getCarColor()
	{
		return color;
	}
	public void setCarColor(String color)
	{
		this.color=color;
	}
	
	public void onRoadPrice()
	{
		System.out.println("Base Price is Rs.100000");
	}
	
	void superClassMethod()
	{
		System.out.println("This method belongs to Super Class");
	}
	
	public void numberOfWheels()
	{
	System.out.println("Calling Car class method");
	}

	
}
