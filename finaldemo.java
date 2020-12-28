class A
{
    	final int a = 10;
	public final void display()
	{
		//a = 50;
		System.out.println("Changed value is :" +a);
	}


}
class finaldemo extends A
{
	public static void main(String args[])
	{
	 System.out.println("This is Demo for Final Keyword");
	 A a1 = new A();
	 System.out.println(a1.a);
	 a1.display();
	}  

}