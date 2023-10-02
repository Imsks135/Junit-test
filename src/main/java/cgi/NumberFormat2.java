package cgi;
import java.util.*;

public class NumberFormat2 {
    public static void main(String[] args) {
    	
    	Scanner sc= new Scanner(System.in);
         int number = 0;
        boolean isinput = false;  
        while (!isinput) {
            try {
                System.out.print("Enter a number: ");
                 String input = sc.nextLine();
                 number = Integer.parseInt(input);
                 isinput = true;
                
            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException => Please enter a valid integer");
            }
        }
        System.out.println("Number re-entered: " + number);
        sc.close();
    }
}
