
interface RBI
{
   	int a=8;
	void loan(); //no method defining(body) is an abstract method which implements interface
}


class SBI implements RBI
{
 	public void loan()
	{
	  System.out.println("SBI Class");
	}
}

class interfacedemo
{
	public static void main(String args[])
	{
  	System.out.println("---This is Interface Demo---");

	SBI s = new SBI();
	s.loan();
	}

}
