package cgi;

public class Numberformathandling {
   public static void main(String[] args) {
	   String s1="1234";
	   String s2="abc";
	   
	   try {
		   int n1=Integer.parseInt(s1);
		   int n2=Integer.parseInt(s2);
		   
		   System.out.println("Number1+ "+ n1);
		   System.out.println("Number2+ "+n2);
	   }
	   catch(NumberFormatException e) {
		   System.out.println("NumberFormatException => "+ e.getMessage());
	   }
   }
}
