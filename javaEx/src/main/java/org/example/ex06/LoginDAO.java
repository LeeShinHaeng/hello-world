package org.example.ex06;

import java.util.HashMap;

public class LoginDAO {
    /**
     * map에서 사용할 키값
     */
    public static final String KEY_ID = "id";
    public static final String KEY_PW = "passwd";

    private String memId;
    private String memPasswd;

    public LoginDAO() {
        /**
         * 미리 정해 놓은 아이디와 패스워드
         */
        this.memId = "abcd";
        this.memPasswd = "1234";
    }

    public boolean loginCheck(HashMap<String, String> map) {
        if (map.get(KEY_ID).equals(memId) &&
                map.get(KEY_PW).equals(memPasswd)) {
            System.out.println("아이디와 패스워드가 일치");
            return true;
        }
        System.out.println("아이디와 패스워드가 불일치");
        return false;
    }

}
