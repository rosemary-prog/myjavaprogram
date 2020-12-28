 class A
{  
   int a= 50;
     void display()
     {  
        int b= 60;
        System.out.println(a);
    	System.out.println("b value inside display method: "+b);

     }
}

class variabledemo
{        
   public static void main(String args[])
   {
     System.out.println("This is variable demo");
        int a = 90;
	
	System.out.println(a);
	A a1= new A();
	a1.display();
   }


}