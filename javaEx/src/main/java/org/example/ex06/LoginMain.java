package org.example.ex06;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        LoginController controller = new LoginController();
        Scanner sc = new Scanner(System.in);
        String id, pw;
        boolean result;

        while(true){
            System.out.print("아이디: ");
            id = sc.nextLine();
            System.out.print("비밀번호: ");
            pw = sc.nextLine();

            result = controller.loginCheck(id, pw);
            if(result){
                System.out.print("LoginMain.main");
                System.out.println("로그인 성공!");
                System.out.println("프로그램 종료");
                break;
            }
            System.out.print("LoginMain.main");
            System.out.println("로그인 실패");
        }


        sc.close();
    }
}
