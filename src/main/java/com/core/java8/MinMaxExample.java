package com.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<Employee>();
        PhoneNumber p1 = new PhoneNumber(91, 85054280, 6683323);
        PhoneNumber p2 = new PhoneNumber(81, 95054280, 6983323);
        PhoneNumber p3 = new PhoneNumber(71, 65054280, 6183323);
        PhoneNumber p4 = new PhoneNumber(11, 15054280, 61683323);
        PhoneNumber p5 = new PhoneNumber(01, 95154280, 6083323);

        emps.add(new Employee(1, "Lokesh", 36, 5000.23, new Address(112, "SG", Arrays.asList(p1,p2,p3), 778)));
        emps.add(new Employee(2, "Alex", 46, 3000.50, new Address(112, "SG", Arrays.asList(p3,p4,p5), 778)));
        emps.add(new Employee(3, "Brian", 52, 2500.57, new Address(112, "SG", Arrays.asList(p3,p4,p5), 778)));
        emps.add(new Employee(3, "Nitya", 31, 7000.00, new Address(112, "SG", Arrays.asList(p3,p4,p5), 778)));
        emps.add(new Employee(3, "Tasnim", 28, 10000.00, new Address(112, "SG", Arrays.asList(p1,p2,p5), 778)));
        emps.add(new Employee(3, "Chiku", 30, 15000.00, new Address(112, "SG", Arrays.asList(p2,p4,p5), 778)));
        emps.add(new Employee(3, "Chandan", 29, 4000.00, new Address(112, "SG", Arrays.asList(p2,p4,p5), 778)));

        // Comparator<Employee> comparator = Comparator.comparing(Employee::getAge);

        // Get Min or Max Object
        Employee minObject = emps.stream().min(Comparator.comparing(t -> t.getAge())).get();
        Employee maxObject = emps.stream().max(Comparator.comparing(t -> t.getAge())).get();


        System.out.println("minObject = " + minObject);
        System.out.println("maxObject = " + maxObject);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);

        // Get Min or Max Number
        //Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
        //Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();

        Integer maxNumber = intList.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer minNumber = intList.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
    }
}

class PhoneNumber {
    public PhoneNumber(int code, int homeNo, int officeNo) {
        this.code = code;
        this.homeNo = homeNo;
        this.officeNo = officeNo;
    }

    private int code;
    private int homeNo;
    private int officeNo;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }

    public int getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(int officeNo) {
        this.officeNo = officeNo;
    }

}

class Address {
    public Address(int id, String location, List<PhoneNumber> phoneList, int pinCode) {
        this.id = id;
        this.location = location;
        this.phoneList = phoneList;
        this.pinCode = pinCode;
    }

    private int id;
    private String location;
    private List<PhoneNumber> phoneList;
    private int pinCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<PhoneNumber> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<PhoneNumber> phoneList) {
        this.phoneList = phoneList;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private Address address;


    public Employee(int id, String name, int age, double salary, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder str = null;
        str = new StringBuilder();
        str.append("Id:- " + getId() + " Name:- " + getName() + " Age:- " + getAge());
        return str.toString();
    }
}
