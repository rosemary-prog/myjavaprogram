class Xyz
 {

    Xyz()
{
 System.out.println("Hello from class Xyz");

}
    void display1()
    {
      System.out.println("this is display 1 method");
    }

 }

class Abc extends Xyz
{

    super();
    void display2()
    {
      System.out.println("this is display 2 method inside class Abc");
    }

}
class inheritancedemo
{
   public static void main(String args[])
   {
   System.out.println("---inheritance--");
   Abc a1 = new Abc();
   }
}