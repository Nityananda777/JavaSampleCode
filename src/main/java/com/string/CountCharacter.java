package com.string;

public class CountCharacter {
	public static void main(String[] args) {
		String s = "java";
		int count = 0;
/*		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}

		}*/
		char a[]=s.toCharArray();
		for(char aa:a)
		{
		if(aa=='a')
		{
			count++;
		}
		}
		System.out.println("count of a is.." + count);
	}
}
