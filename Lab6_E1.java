// Create a class Customer
with the following specifications. 


Private Members :


               Customer_no ,
Customer_name,  Qty ,  Price, TotalPrice, Discount, Netprice.


  Methods: Public members:


               1. A parameterized constructor
to assign initial


               2. Input( ) – to read data
members. Call Caldiscount().


               3. Caldiscount ( ) – To
calculate Discount according to TotalPrice and NetPrice


                      TotalPrice = Price*Qty


                      TotalPrice >=50000 – Discount 25% of
TotalPrice


                      TotalPrice >=25000 - Discount 10% of
TotalPrice


                      Netprice=
TotalPrice-Discount


        4.
Show( ) – to display Customer details.                     

import java.util.*;
class Customer
{
    private int c_no;
  private String c_name;
private float qt;
private double price;
private double tp;
private double discount;
private double netprice;
Customer(float q,double d)
{
qt=q;
discount=d;
}
public void input()

{
Scanner s=new Scanner(System.in);
System.out.println("enter customer number and name,quantity,price,total price and net price:");
c_no=s.nextInt();
c_name=s.next();
qt=s.nextFloat();
price=s.nextDouble();
discount=s.nextDouble();
netprice=s.nextDouble();
}
public void cd()
{
tp=price*qt;
if(tp>=50000)
{
discount=0.25*tp;}
else if(tp>=25000&&tp<50000)
{
discount=0.1*tp;
}
else
{System.out.println("no discount");}
netprice=tp-discount;
}
public void display()
{
System.out.println(c_no+"  " +c_name+" "+qt+" "+netprice);
System.out.println("total discount:"+discount);
}}
class Cost
{
public static void main(String args[])
{
Customer c=new Customer(3,100);
c.input();
c.cd();
c.display();
}
}
