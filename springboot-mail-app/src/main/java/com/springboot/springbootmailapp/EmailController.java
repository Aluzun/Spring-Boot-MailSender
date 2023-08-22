package com.springboot.springbootmailapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	private final JavaMailSender mailSender;
	
	@Autowired
    public EmailController(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
	
	@RequestMapping(value = "/send-email", method = RequestMethod.POST, consumes = "application/json")
    public void sendEmail(@RequestBody EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailRequest.getFrom());
        message.setTo(emailRequest.getTo());
        message.setSubject(emailRequest.getSubject());
        message.setText(emailRequest.getBody());

        mailSender.send(message);
    }
}
	
