import java.util.*;
class employeemanagement
{	
  public static void main(String args[])
  {
	System.out.println("---Employee Management System---");
	System.out.println("---MENU--- \n 1. Enter Employee Details \n 2. Display Employee Details");
 	String empname ="";
	String desig = "";
	int empid =0;
	String decision = "yes";
	int choice = 0;
	
	
	

       do 
	{
	  System.out.println("Enter your choice");
	  Scanner scan = new Scanner(System.in);
	  choice = scan.nextInt();		
	  switch (choice)
	{
	 case 1: System.out.println("---ENTERING EMPLOYEE DETAILS---");
		 System.out.println("Enter Employee Name");
		 empname = scan.next();
		 System.out.println("Enter Employee ID");
		 empid = scan.nextInt();
		 System.out.println("Enter Employee Designation");
		 desig = scan.next();
		 break;

	 case 2: System.out.println("---DISPLAYING EMPLOYEE DETAILS---");
		 System.out.println("Employee name : \t" +empname+ "\n");
		 System.out.println("Employee ID : \t" +empid+ "\n");
		 System.out.println("Employee designation : \t" +desig+ "\n");
		 break;

	default: System.out.println("WRONG CHOICE!!! Press 1 or 2");
		 break;

       }
	
  	System.out.println("Do you want to continue? YES or NO");
	decision = scan.next();
	
	} while(decision.equalsIgnoreCase("yes"));

}
}
		
	