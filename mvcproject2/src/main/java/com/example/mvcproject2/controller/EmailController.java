package com.example.mvcproject2.controller;

import com.example.mvcproject2.domain.SendEmailRequest;
import com.example.mvcproject2.service.EmailServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/email")
public class EmailController {
    @Autowired
    public EmailServiceClient emailServiceClient;

    // http://localhost:8080/email/sendEmail
    @RequestMapping("/sendEmail")
    @ResponseBody
    public String sendEmail() {
        SendEmailRequest sendEmailRequest = generateEmailRequest();
        emailServiceClient.sendEmail(sendEmailRequest);
        return "SUCCESS";
    }

    private SendEmailRequest generateEmailRequest() {
        SendEmailRequest request = new SendEmailRequest();
        request.setToAddress("test@example.com");
        request.setSubject("Test email");
        request.setBody("This is a test email");
        return request;
    }
}
