 class A
{  
   int a$= 50; //only $ and _ are exceptions in identifiers
     void display()
     {  
        int b_b = 60;
        System.out.println(a$);
    	System.out.println("b value inside display method: "+b_b);

     }
}

class identifierdemo
{        
   public static void main(String args[])
   {
     System.out.println("This is identifier demo");
        int ab1234 = 90;
	
	System.out.println(ab1234);
	A a1= new A();
	a1.display();
   }


}