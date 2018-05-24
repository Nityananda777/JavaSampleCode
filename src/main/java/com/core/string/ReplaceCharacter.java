package com.core.string;

public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="Hello world";
	StringBuilder sb=new StringBuilder();
	char []a=s.toCharArray();
	for(Character aa:a)
	{
	if(aa!=' ')
	{
	sb.append(aa);	
	}
	}
	System.out.println(sb.toString());
	}

}
