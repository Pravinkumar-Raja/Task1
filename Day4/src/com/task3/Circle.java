package com.task3;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawn the shape Circle");
		
	}
	public void display()
	{
		System.out.println("This method can be accessed if the reference and object created for the Triangle Class");
	}
	
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.display();
		
		Shape s= new Circle();
		s.draw();
		
	}

}
