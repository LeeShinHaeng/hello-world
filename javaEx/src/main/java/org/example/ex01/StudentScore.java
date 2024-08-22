package org.example.ex01;

public class StudentScore {
    public static void main(String[] args) {
        int[][] scores = {
                {50, 60, 70, 80}, {60, 70, 80, 90}, {70, 80, 90, 100}
        };

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double average = (double) sum / scores[i].length;
            System.out.println(i + 1 + "번 학생의 평균: " + average);
        }
    }
}
