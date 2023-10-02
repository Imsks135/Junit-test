package cgi;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionTest {
	public static void main(String[] args) {
		
        File file = new File("/cgi/src/main/java/cgi/Data.txt");
        
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException =>'Data.txt' was not found in the specified location");
        }
    }
} 
