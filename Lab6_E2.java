//2.    
Develop a Java program
to create a classPatient with data members pt_id, pt_name, pt_age, doc.


      The
program should include the following functionalities.


·      
Accept
n patient details.


·      
Accept
a patient id and display his/her details.


·      
Accept
the name of the doctor and display the names of all the patients treated  by him/her.  
import java.util.Scanner;
class patient 
{
	int ptid,ptage;
	String ptname;
	String doc;
	Scanner s=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter patient ID, Name, Age and Doctor name");
		ptid=s.nextInt();
		ptname=s.next();
		ptage=s.nextInt();
		doc=s.next();
	}
	void display()
	{
		System.out.println("Patient ID:"+ptid+"\npatient Name:"+ptname+"\nAge:"+ptage+"\nDoctor Name:"+doc);
	}

}

class main
{
import java.util.Scanner;

class Customer{
private int cust_no;
private String cust_name;
private int quantity;
private float price;
private float total_price,discount,net_price;

Customer(){}

Customer(int no,String name,int qua,float pri){
cust_no=no;
cust_name=name;
quantity=qua;
price=pri;
total_price=quantity*price;
}

void input(){
Scanner s=new Scanner(System.in);
System.out.println("Enter customer number,customer name,item quantity,item price");
cust_no=s.nextInt();
cust_name=s.next();
quantity=s.nextInt();
price=s.nextFloat();
total_price=quantity*price;
}

void calDiscount(){
if(total_price>=50000){
discount=(float)(total_price*0.25);
}else if(total_price>=25000){
discount=(float)(total_price*0.1);
}else{
discount=0;
}
net_price=total_price-discount;
}

void show(){
System.out.println("-----Customer Details--------");
System.out.println("\n\nCustomer number: "+cust_no+"\nCustomer name: "+cust_name+"\nQuantity: "+quantity+"\nItem price: "+price+"\nTotal price: "+total_price+"\nDiscount: "+discount+"\nNet price: "+net_price+"\n\n");
}

}

class Lab_6{
public static void main(String x[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter number of objects to be created");
int n=s.nextInt();
Customer[] c=new Customer[n];
for(int i=0;i<n;i++){
System.out.println("Enter customer number,customer name,item quantity,item price");
int no=s.nextInt();
String name=s.next();
int qua=s.nextInt();
float pr=s.nextFloat();
c[i]=new Customer(no,name,qua,pr);
c[i].calDiscount();
}

for(int i=0;i<n;i++){
c[i].show();
}

}

}