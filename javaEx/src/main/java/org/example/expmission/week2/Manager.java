package org.example.expmission.week2;

public class Manager extends Employee {
    private int numOfEmp;

    public Manager(String empName,
                   int salary,
                   String position,
                   int numOfEmp) {
        super(empName, salary, position);
        this.numOfEmp = numOfEmp;
    }

    @Override
    public void payRise() {
        salary += 1000;
    }
}
