/*Create
an abstract class Calculate which has three double members -say x,
y and result. Include a method calc. Derive three classes
from Calculate which performs any three arithmetic operations on the two
variables x and y and assign the result to the variable result.
Make appropriate declarations and definitions. */
import java.util.Scanner;
import java.lang.Math;
abstract class Calculate
{
	Calculate(){}
	double x,y,result;
	abstract void calc();
	}
class a1 extends Calculate
{
	Scanner s=new Scanner(System.in);
	void calc()
		{
			System.out.println("Enter values for x and y");
			x=s.nextDouble();
			y=s.nextDouble();
			result=x+y;
			System.out.println("Sum= "+result);
			}
	a1(){}
}


class a2 extends Calculate
{
	Scanner s=new Scanner(System.in);
	void calc()
		{
			System.out.println("Enter values for x and y");
			x=s.nextDouble();
			y=s.nextDouble();
			result=x*y;
			System.out.println("Product= "+result);
			}
	a2(){}
}

class a3 extends Calculate
{
	Scanner s=new Scanner(System.in);
	void calc()
		{
			System.out.println("Enter values for x and y");
			x=s.nextDouble();
			y=s.nextDouble();
			result=x/y;
			System.out.println("Quotient="+result);
			}
	a3(){}
}


class Arith
{
public static void main(String xx[])
{
	a1 a =new a1();
	a.calc();
	a2 b =new a2();
	b.calc();
	a3 c =new a3();
	c.calc();
		
}
}