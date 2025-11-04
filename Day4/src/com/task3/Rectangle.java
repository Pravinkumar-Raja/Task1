package com.task3;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawn the shape Rectangle");
		
	}
	public void display()
	{
		System.out.println("This method can be accessed if the reference and object created for the Triangle Class");
	}
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.draw();
		r.display();
		
		Shape s=new Rectangle();
		s.draw();
	}

}
