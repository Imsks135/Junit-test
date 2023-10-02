package cgi;

public class Pallindrome {
      boolean checkpalindrome(String str) {
    	  int i=0;//starting index
    	  int j=str.length()-1;//ending index
    	  while(i<j) {
    		  if(str.charAt(i)!=str.charAt(j)) {
    			  return false;//characters are not equal
    		  }
    		  i++;
    		  j--;
    	  }
    	  return true;//characters are equal 
      }
}
