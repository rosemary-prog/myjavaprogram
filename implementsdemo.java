interface RBI
{
   	 
	void loan(); //no method defining(body) is an abstract method which implements interface
	
	public default void display()
	{
           System.out.println("Hello from RBI interface");
	}
	
        
}

interface RBI2
{
	void loanRecover();
}


 class SBI implements RBI, RBI2
{
 	public void loan()
	{
	  System.out.println("SBI Class");
	}
	public void loanRecover()
	{
	  System.out.println("SBI Class Loan Recover");
	}

}
class implementsdemo
{
	public static void main(String args[])
	{
  	System.out.println("---This is Interface Demo---");

	SBI s = new SBI();
	s.loan();
	s.loanRecover();
	s.display();
	}

}
