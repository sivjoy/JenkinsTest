package com.stringHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class CollectionsSort {
	
	List<String> list = new ArrayList<String>();
	
	@Test
	public void sort()	{
		list.add("One");
		list.add("one");
		list.add("Two");
		list.add("two");
		System.out.println("Before Sorting : "+list);
		Collections.sort(list);
		System.out.println("After Sorting : "+list);
	}
	
	@Test
	public void CreateDictionary() throws IOException	{
		Set<String> set  = new TreeSet<String>();
		FileReader read = new FileReader("C:\\Users\\sivaramt\\Downloads\\enable1.txt");
		BufferedReader bufferRead = new BufferedReader(read);
		String  lineVal;
		while((lineVal=bufferRead.readLine())!=null)
			set.add(lineVal);
		//for(String word:set)
			//System.out.println(set);
		if(set.contains("hello"))
			System.out.println("Word Hello is found");
		else
			System.out.println("Word Hello is not found");
		bufferRead.close();
	}
	
}
