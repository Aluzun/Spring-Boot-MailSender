package com.springboot.springbootmailapp;

import java.io.File;
import java.io.Serializable;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.Message;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailRequest implements Serializable {

	private String from;
    private String to;
    private String subject;
    private String body;
    private String fileToAttach; 
    
	public String getFrom() {
		// TODO Auto-generated method stub
		return from;
	}

	public String getTo() {
		// TODO Auto-generated method stub
		return to;
	}

	public String getSubject() {
		// TODO Auto-generated method stub
		return subject;
	}

	public String getBody() {
		// TODO Auto-generated method stub
		return body;
	}
	
	public String fileToAttach() {
		// TODO Auto-generated method stub
		return fileToAttach;
	}

}
