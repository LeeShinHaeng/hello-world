package org.example.ex05;

public class MultiTryCatch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
//            System.out.println(arr[5]);
            System.out.println(Integer.parseInt("1a"));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
