package com.core.java8;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamOperation {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<Employee>();
        PhoneNumber p1 = new PhoneNumber(91, 85054280, 6683323);
        PhoneNumber p2 = new PhoneNumber(81, 95054280, 6983323);
        PhoneNumber p3 = new PhoneNumber(71, 65054280, 6183323);
        PhoneNumber p4 = new PhoneNumber(11, 15054280, 61683323);
        PhoneNumber p5 = new PhoneNumber(01, 95154280, 6083323);

        emps.add(new Employee(1, "Lokesh", 36, 5000.23, new Address(112, "SG", Arrays.asList(p1, p2, p3), 778)));
        emps.add(new Employee(2, "Alex", 46, 3000.50, new Address(112, "SG", Arrays.asList(p3, p4, p5), 778)));
        emps.add(new Employee(3, "Brian", 52, 2500.57, new Address(112, "SG", Arrays.asList(p3, p4, p5), 778)));
        emps.add(new Employee(3, "Nitya", 31, 7000.00, new Address(112, "SG", Arrays.asList(p3, p4, p5), 778)));
        emps.add(new Employee(3, "Tasnim", 28, 10000.00, new Address(112, "SG", Arrays.asList(p1, p2, p5), 778)));
        emps.add(new Employee(3, "Chiku", 30, 15000.00, new Address(112, "SG", Arrays.asList(p2, p4, p5), 778)));
        emps.add(new Employee(3, "Chandan", 29, 4000.00, new Address(112, "SG", Arrays.asList(p2, p4, p5), 778)));

        System.out.println(getMaxSalary(emps));
        System.out.println(getMinSalary(emps));
        int code=emps.stream().map(e->e.getAddress()).flatMap(p->p.getPhoneList().stream().filter(h->h.getHomeNo()==65054280)).findAny().get().getCode();
        System.out.println("code is :"+code);
        System.out.println("..Get emp name by city..");
       // System.out.println(getNameByCity(emps));

    }

    private static double getMaxSalary(List<Employee> employeeList) {
        return employeeList.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
    }

    private static double getMinSalary(List<Employee> employeeList) {
        return employeeList.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
    }


}
