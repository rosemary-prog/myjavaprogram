class StringDemo
{
	public static void main(String args[])
	{
	 System.out.println("---This is String Demo---");
	 String str1 = "hello";
	 String str2 = "how are you?";
	 String str3 = "this is a session for String Methods Demo";


         System.out.println("toUpperCase method :" +str1.toUpperCase());
	 System.out.println("toLowerCase method :" +str2.toLowerCase());
	 String cnct = str1.concat(str2);
	 System.out.println("Concatenation method :" +cnct);
	 System.out.println("String Length method :" +str3.length());
	 System.out.println("compareTo() Method :" +str1.compareTo(str2));
	 System.out.println("Substring(int i ,int j) method :" +str3.substring(1,3));
	 System.out.println("String Replace Method replacing hello :" +str1.replace("hello","hey"));
	 System.out.println("Contains Method, checkhing for how in how are you :" +str2.contains("how"));
	 System.out.println("charAt method :" +str3.charAt(6));
	 System.out.println("Comparing two Strings :" +str1.equalsIgnoreCase("HELLO"));
	 }
}