package com.stringHandling;

import org.testng.annotations.Test;

public class StringBufferTest {

	String word = "Madam";
	StringBuffer strBuffer;
	
	@Test
	public void Palindrome()	{
		strBuffer  = new StringBuffer(word);
		strBuffer.reverse();
		if(word.equalsIgnoreCase(strBuffer.toString()))
			System.out.println("Yes, the string is a palindrome.");
		else
			System.out.println("Nope , Not a palindrome.");
	}
	
	@Test
	public void checkStringBufferFunctions()	{
		strBuffer.append("Word1");
		System.out.println(strBuffer);
	}
	
	//@Test
	public void printPermutations()	{
		for(String character:word.split(""))
			printWord(character);
	}
	
	public void printWord(String character){
		
	}
	
}
