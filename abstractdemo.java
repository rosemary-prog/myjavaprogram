abstract class RBI
{
     abstract void loan();
}

class SBI extends RBI
{    
    void loan()
	{
	System.out.println("SBI provides,personal loan with 8% interest");
	}

}
 
class Axis extends RBI
{
	void loan()
	{
	  System.out.println("Axis provides,personal loan with 9% interest");
	}
}

class ICICI extends RBI
{
        void loan()
	{
	   System.out.println("ICICI provides,personal loan with 12% interest");
	}
}

class abstractdemo
{
   public static void main(String args[])
	{
	    System.out.println("---This is Abstract Demo---");
	     
	    SBI s =new SBI();
	    s.loan();
	    
            Axis a = new Axis();
	    a.loan();
	
	    ICICI i = new ICICI();
	    i.loan();
	
	 }
}