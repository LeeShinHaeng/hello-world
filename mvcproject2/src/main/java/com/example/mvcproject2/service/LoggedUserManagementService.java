package com.example.mvcproject2.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope   // 동일한 세션으로 전송된 모든 요청에 대해 동일한 인스턴스에 접근
public class LoggedUserManagementService {
    // 세션이 유지되는 동안 저장할 데이터
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
