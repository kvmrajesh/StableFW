package com.InterviewQuestions;

class Reversenumber {
	
	public String reverse(int number) {
		String finalnumber = String.valueOf(0);
		String str = String.valueOf(number);
		for (int i = str.length()-1; i>=0;i--)
		{
			finalnumber =   finalnumber + str.charAt(i) ;
			
		}
		return finalnumber;
		
	}
}

public class ReversenumberTest{
	
	public static void main(String[] args) {
		
		Reversenumber rn = new Reversenumber();
		System.out.println(rn.reverse(24682468));
	}
}
