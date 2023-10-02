package cgi;

import static org.junit.Assert.*;

import org.junit.Test;

public class PallindromeTest {

	@Test
	public void testnotpallindrome() {
		Pallindrome obj=new Pallindrome();
		boolean result=obj.checkpalindrome("satyam");
		assertEquals(false,result);
	}
	@Test
	public void testpallindrome() {
		Pallindrome obj=new Pallindrome();
		boolean result=obj.checkpalindrome("abba");
		assertEquals(true,result);
	}

}
