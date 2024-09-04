package com.example.mvcproject2.service;

import com.example.mvcproject2.domain.SendEmailRequest;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceClient {

    public void sendEmail(SendEmailRequest request) {
        // 이메일 전송 로직
        System.out.println("Sending email to " + request.getToAddress());
        System.out.println("Subject: " + request.getSubject());
        System.out.println("Body: " + request.getBody());
        // 이메일 발송 성공 시 추가 로직
    }
}
