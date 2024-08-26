package org.example.expmission.week2;

public class Employee {
    private String empName;
    protected int salary;
    private String position;

    public Employee(String empName,
                    int salary,
                    String position) {
        this.empName = empName;
        this.salary = salary;
        this.position = position;
    }

    public void payRise() {
        salary += 100;
    }

    public int getSalary() {
        return salary;
    }
}
