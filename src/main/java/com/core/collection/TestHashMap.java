package com.core.collection;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "raja", 101.00, new Date());
		Employee e2 = new Employee(102, "ramesh", 102.00, new Date());
		Map<Employee, String> m = new HashMap<>();
		m.put(e1, e1.getName());
		m.put(e2, e2.getName());
		e1.setEmpId(103);
		Set<Map.Entry<Employee, String>> s = m.entrySet();
		Iterator<Map.Entry<Employee, String>> it = s.iterator();
		while (it.hasNext()) {
			Map.Entry<Employee, String> entry = it.next();
			Employee eS = entry.getKey();
			String s2 = entry.getValue();
			System.out.println(eS.getEmpId());
			System.out.println(eS.getName());
			System.out.println(eS.getSalary());
			System.out.println(eS.getDateOfJoining());
		}
		System.out.println(e1.equals(e2));
	}

}
