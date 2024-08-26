package org.example.expmission.week2;

public class EmpManagerMain {
    public static void main(String[] args) {
        Employee employee = new Employee("홍길동",
                1000,
                "사원");

        Manager manager = new Manager("이신행",
                2000,
                "사장",
                10);

        System.out.println("사원 인상 전: " + employee.getSalary());
        employee.payRise();
        System.out.println("사원 인상 후: " + employee.getSalary());
        System.out.println("--");
        System.out.println("관리자 인상 전: " + manager.getSalary());
        manager.payRise();
        System.out.println("관리자 인상 후: " + manager.getSalary());


    }
}
