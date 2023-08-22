package com.springboot.springbootmailapp;

import java.io.Serializable;

public class EmailRequest implements Serializable {

	private String from;
    private String to;
    private String subject;
    private String body;
    
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

}
