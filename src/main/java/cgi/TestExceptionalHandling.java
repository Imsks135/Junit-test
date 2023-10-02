package cgi;

public class TestExceptionalHandling {
      public static void main(String[] args) {
    	  try {
    		  int dividebyzero=5/0;
    		  System.out.println("try block is executed");
    		  System.out.println("output is "+ dividebyzero);
    	  }
    	  catch(ArithmeticException e) {
    		  System.out.println("catch block is executed");
    		  System.out.println("ArithmeticException =>"+ e.getMessage());
    	  }
      }
}
