package test.java.org.nik.tddexample;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.test.java.org.nik.tddexample.StringHelper;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testStrWith2CharsIsReversed() {

		assertEquals("BA", helper.swapLast2Chars("AB"));

	}

	@Test
	public void testStrWith4Chars() {

		assertEquals("ABDC", helper.swapLast2Chars("ABCD"));

	}

	
	@Test
	public void testStrWith10Chars() {

		assertEquals("ABCDEFGHJI", helper.swapLast2Chars("ABCDEFGHIJ"));

	}
	
	@Test
	public void testStrWith1Char() {

		assertEquals("A", helper.swapLast2Chars("A"));

	}
	@Test
	public void testStrWith0Char() {

		assertEquals("", helper.swapLast2Chars(""));

	}
	
	@Test
	public void testStringHavingAInfirstCharacterOnly(){
		assertEquals("BCD",helper.removeAInFirst2Chars("ABCD"));
		
		
	}
	
	@Test
	public void testStringHavingNoAInfirst2CharacterOnly(){
		assertEquals("BBAA",helper.removeAInFirst2Chars("BBAA"));
		
		
	}
	
	
	


}
