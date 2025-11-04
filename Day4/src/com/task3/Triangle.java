package com.task3;

public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawn the shape Triangle");
		
	}
	public void display()
	{
		System.out.println("This method can be accessed if the reference and object created for the Triangle Class");
	}
	public static void main(String[] args) {
		Triangle t =new Triangle();
		t.draw();
		t.display();
		
		Shape s=new Triangle();
		s.draw();

		
	}


}
