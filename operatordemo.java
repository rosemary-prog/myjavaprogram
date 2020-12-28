
class operatordemo
{        
   public static void main(String args[])
   {
        System.out.println("This is operator demo");
        int a = 90;
	int b= 100;
	float c= a+b;
	float d= a-b;
	float e= a*b;
	float f= a%b;
	
	System.out.println("value of a is:" +a);
	System.out.println("value of b is:" +b);
	System.out.println("Adding a and b is:" +c);
	System.out.println("subtracting a and b is:" +d); 
	System.out.println("multiplying a and b is:" +e);
	System.out.println("modulo of a%b is:" +b); 

	System.out.println("comparing values of a and b using relational operators: ==,!=,<,>,<=,>=");
	System.out.println(a == b);
	System.out.println(a!=b);
	System.out.println(a<b);
	System.out.println(a>b); 
	System.out.println(a<=b);
	System.out.println(a>=b);

	System.out.println("comparing values of a and b using logical operators: &&,||,!");
	System.out.println( if((a<b) && (b>c)));
	System.out.println(if((a=b)|| (a=c)));
	System.out.println(if(!(a>b)));
	 
	
   }


}