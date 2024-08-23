package org.example.ex02;

public class Student {
    private String stdNo;
    private String stdName;
    private int stdYear;

    public Student(String stdNo, String stdName, int stdYear) {
        this.stdNo = stdNo;
        this.stdName = stdName;
        this.stdYear = stdYear;
    }

    public String getStdNo() {
        return stdNo;
    }

    public String getStdName() {
        return stdName;
    }

    public int getStdYear() {
        return stdYear;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setStdYear(int stdYear) {
        this.stdYear = stdYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdNo='" + stdNo + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdYear=" + stdYear +
                '}';
    }

    public void show() {
        System.out.println("Student{" +
                "stdNo='" + stdNo + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdYear=" + stdYear +
                '}');
    }
}
