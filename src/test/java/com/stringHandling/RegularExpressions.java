package com.stringHandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegularExpressions {

	//@Test
	public void regularExpressions()	{
		String sentance = "Hi this is a reg \n expression/pattern.123 35 45f d";
		String replaceString = sentance.replaceAll("[\n\\d]", "");
		System.out.println(sentance);
		System.out.println(replaceString);
	}
	
	//@Test
	public void patternMatcher()	{
		String sentance = "425-882-8080";
		Pattern p = Pattern.compile("[\\d]{2}?-[\\d]{3}-[\\d]{4}");
		Matcher m = p.matcher(sentance);
		if(m.find())
			System.out.println("yes Matches");
		else
			System.out.println("No Matches");
	}
	
	@Test
	public void patternMatcher2()	{
		String sentance = "Hi this is a reg \n expression/pattern.123 35 45f d";
		String sentance1 ="Hikdnfkdnf";
		if(sentance.matches("\\w+|\\W+"))
			System.out.println("yes Matches");
		else
			System.out.println("No Matches");
	}
	
	
}
