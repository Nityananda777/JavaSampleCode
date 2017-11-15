package com.core.basic;

public class PalindromeTest {

	public static void main(String[] args) {
	
		int n = 12121;
		int reverse = reverseNumber(n);
		//checking reverse no with the actual no to main palindrome no contracts
		if (n == reverse) {
			System.out.println(n +"  is palindrome no");
		} else {
			System.out.println(n +"  is  not palindrome no");
		}
	}

	//Reversing a number
	public static int reverseNumber(int n) {
	
		int r = 0;
		while (n > 0) {
			r = (r * 10) + n % 10;
			n = n / 10;
		}
		return r;

	}

}
