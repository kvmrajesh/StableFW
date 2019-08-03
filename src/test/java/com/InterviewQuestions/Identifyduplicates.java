package com.InterviewQuestions;

import java.util.HashSet;
import java.util.TreeSet;

public class Identifyduplicates {

public static void main(String[] args) {
	
	int[] arr = {10,22,35,49,49,50,99,100,101,};
	 System.out.println("array size " +arr.length);
	 
	 
	 HashSet<Integer> hs = new HashSet();
//	 hs.add(arr[0]);
	 
	 for (int i = 0 ; i <=arr.length-1;i++)
	 {
		 hs.add(arr[i]);
	 }
	 
	System.out.println("size after filtering duplicates :"+hs.size());
	 System.out.println("Using Hash Set");
	for(Object temp:hs)
	 {
		System.out.println(temp);

	 }

	
	 TreeSet<Integer> ts = new TreeSet<Integer>();
	 for (int i = 0 ; i<=arr.length-1;i++)
	 {
		 ts.add(arr[i]);
	 }	
	
	 System.out.println("size after filtering duplicates :"+ ts.size());

	 System.out.println("Using Tree Set");
	 for (Object temp:ts)
	 {	
		 System.out.println(temp);
	 }

}
}