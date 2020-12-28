class Abc
{
    int x,y;
    String name;
    Abc(int x,int y)
   {
     this.x= 20;
     this.y= 50;
   }

	
   void display()
   {
 	   
      System.out.println("name:" +x ,+y);
   }
		
 public static void main(String args[])
	{
	   Abc a1 = new Abc();
	   a1.display();
	}
	


}