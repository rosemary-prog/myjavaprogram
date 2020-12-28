import java.util.Scanner;
class grade
{  
      void display(int mark1 )
     {  
        if ( mark1 < 45 )
        System.out.println("Student Failed");
	else if( mark1 >= 45 && mark1 <= 50 )
	System.out.println("Grade is C");
	else if( mark1 > 50 && mark1 <= 60 )
    	System.out.println("Grade is B");
	else if( mark1 > 60 && mark1 <= 70 )
	System.out.println("Grade is B+");
	else if( mark1 > 70 && mark1 <= 80 )
	System.out.println("Grade is A");
	else if( mark1 > 80 && mark1 <= 90 )
	System.out.println("Grade is A+");
	else if( mark1 > 90 && mark1 <= 100 )
	System.out.println("Grade is O");

     }
}

 class marks
{        
   public static void main(String args[])
   {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the mark:");
	int mark1 = scan.nextInt();
		
     	grade M = new grade();
	M.display( mark1 );
   }


}