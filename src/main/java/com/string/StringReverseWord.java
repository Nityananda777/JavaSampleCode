package com.string;

public class StringReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world india";
		
		String[] sp = s.split("\\s");
		String rev = "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length()-1 ; i++) {
			String sps = sp[i];
			
			for (int j = sps.length() - 1; j >= 0; j--) {
				rev = rev+sb.append(sps.charAt(j)).toString();
			}
		}
		System.out.println(rev);
	}
}
