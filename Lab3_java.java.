import java.util.*;
import java.lang.*;
class Book
{
String name,author;
int price,num_pages;
void getval()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter book name,author name,price and number of pages");
name=sc.next();
author=sc.next();
price=sc.nextInt();
num_pages=sc.nextInt();
}
public String toString()
{
 return name+" "+author+" "+price+"Rs "+num_pages+" pages ";
}
void display(Book o)
{
System.out.println(o);
}
}
class Bookv
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
System.out.println("enter the no of books");
int n=ss.nextInt();
Book[] ob=new Book[n];
for(int i=0;i<n;i++)
ob[i]=new Book();
for(int i=0;i<n;i++)
{
ob[i].getval();
}
for(int i=0;i<n;i++)
{
ob[i].display(ob[i]);}
}
}
