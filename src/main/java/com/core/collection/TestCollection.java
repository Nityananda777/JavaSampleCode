package com.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<String,Integer> map=new HashMap<String,Integer>();
	map.put("raja", 12);
	map.put("radha", 12);
	map.put("krishna", 43);
	//System.out.println(map);
	List<Integer> l=new ArrayList();
	l.add(10);
	l.add(12);
	l.add(14);
	l.add(15);
	l.add(15);
	l.add(10);
	l.add(12);
	System.out.println(Collections.frequency(l, 12));
	}
	

}
