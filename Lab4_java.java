

import java.util.Scanner;
abstract class Shape
{
	int x,y;
	double area;
	abstract void printArea();
}
class Rectangle extends Shape
{
	void printArea()
	{
		area=x*y;
		System.out.println("Area of rectangle is: "+area);
	}
}
class Triangle extends Shape
{
	void printArea()
	{
		area=0.5*x*y;
		System.out.println("Area of triangle is: "+area);
	}
}
class Circle extends Shape
{
	void printArea()
	{
		area=3.14*x*x;
		System.out.println("Area of circle is: "+area);
	}
}
class Area
{
	public static void main(String args[])
	{
		Rectangle rec=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		int ch;
	
		Scanner s=new Scanner(System.in);
	System.out.println("menu\n1.rectangle\n2.triangle\n3.circle\n4.exit\n ");

		ch=s.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Enter length: ");
			rec.x=s.nextInt();
			System.out.println("Enter breadth: ");
			rec.y=s.nextInt();
			rec.printArea();
		
		
			case 2:System.out.println("Enter height: ");
			t.x=s.nextInt();
			System.out.println("Enter breadth: ");
			t.y=s.nextInt();
			t.printArea();
		
		         case 3:System.out.println("Enter radius: ");
			c.x=s.nextInt();
			c.printArea();
                          default:System.out.println("invalid input");
}
}
}
		
                 
