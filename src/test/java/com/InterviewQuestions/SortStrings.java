package com.InterviewQuestions;

import java.util.TreeSet;

public class SortStrings {

	
	
	public static void main(String[] args) {
		String[] arr = {"abc", "xyz", "pqr", "lmn"};
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i = 0; i <=arr.length-1;i++)
		{
			ts.add(arr[i]);
		}
		
		for (Object temp:ts)
		{
			System.out.println("After Sorting : "+temp);
		
		}
	}
}
