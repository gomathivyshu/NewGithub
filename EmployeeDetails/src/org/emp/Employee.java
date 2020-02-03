package org.emp;

public class Employee {
public void empId()
{
	System.out.println("id:10011");
}
public void empName()
{
	System.out.println("g");
}
public void empDob()
{
	System.out.println("11/7/1993");
}
public void empPhone()
{
	System.out.println("phn:9003949073");
}
public void empEmail() 
{
	System.out.println("gomathim@gmail.com");
}
public void  empAdress()
{
	System.out.println("chennai");
}
public static void main (String args[])
{
	Employee h=new Employee();
	h.empId();
	h.empName();
	h.empDob();
	h.empPhone();
	h.empEmail();
	h.empAdress();
}}