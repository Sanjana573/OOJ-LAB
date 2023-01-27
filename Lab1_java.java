import java.util.*;
import java.Math.*;
public class quadratic
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter the value of a,b,c");
double a=in.nextDouble();
double b=in.nextDouble();
double c=in.nextDouble();
if(a!=0)
{
double d=b*b-(4*a*c);
if(d>0.0)
{
double r1=(-b+Math.pow(d,0.5)/(2.0*a));
double r2=(-b-Math.pow(d,0.5)/(2.0*a));
System.out.println("the roots are real and distinct");
System.out.println("the roots are"+r1+"and"+r2);
}
else if(d==0.0)
{
double r1=-b/(2.0*a);
System.out.println("the roots are real and equal");
System.out.println("the root is "+r1);
}
else
{
System.out.println("the roots are imaginary");
}
}
else
{
System.out.println("invalid input");
}
}
}
