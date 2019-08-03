package com.InterviewQuestions;

public class ReverseEachWord {
	public static void main(String[] args) {
//		String str = " Good friend is needed";
		String str = " My name is Rajesh";
		String[] arr = str.split(" ");
		String res = "";

		for (int i = 0; i <= arr.length - 1; i++) 
		{
//			System.out.println(arr[i]);
			char[] ch = arr[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) 
				{
					res = res + ch[j];
	
				}
			res = res + " ";
		}
		System.out.println(res);

	}
}
