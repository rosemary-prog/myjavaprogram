class switchdemo
{        
   public static void main(String args[])
   {
       System.out.println("This is switch demo");
       String choice = "hi";
	
	switch (choice)
	{
	  case "hi": System.out.println("You selected Hi");
	  break;
	  case "hello" : System.out.println("You selected Hello");
	  break;
	  case "bye": System.out.println("You selected Bye");	 
	  break;
	  default: System.out.println("Wrong Selection!!!");
	  break;
        }

   
	System.out.println("-----This is Continue Demo -----");
	for(int i=0;i<5;i++)
	  {
            if(i==2)
 	      continue;
	  
	System.out.println("This is continue example:" +i);
	  }
	System.out.println("This is -----Break----- demo");
  	for(int y=1; y<5; y++)
	{
	  if(y==2)
	  break;
	
	
	System.out.println("This is Break example:" +y);
	}
   }
}