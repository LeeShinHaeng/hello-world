package org.example.ex06;

import java.util.HashMap;

public class LoginController {
    LoginDAO dao = new LoginDAO();

    public boolean loginCheck(String id, String password) {
        HashMap<String,String> map = new HashMap<>();
        map.put(LoginDAO.KEY_ID,id);
        map.put(LoginDAO.KEY_PW,password);

        return dao.loginCheck(map);
    }
}
