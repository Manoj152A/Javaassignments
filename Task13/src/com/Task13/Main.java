package com.Task13;

public class Main {
    public static void main(String[] args) {
        Employee employeesalary=new Employee();
        employeesalary.setName("Manoj Mandava");
        employeesalary.setSalary(100000.00);
        employeesalary.setHireDate("07-12-2023");
        System.out.println("Employee Name:"+employeesalary.getName());
        System.out.println("Salary:"+employeesalary.getSalary());
        System.out.println("Your Joining Date would be (mm/dd/yy):"+employeesalary.getHireDate());
    }
}
