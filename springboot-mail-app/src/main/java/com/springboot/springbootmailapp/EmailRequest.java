package com.springboot.springbootmailapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmailRequest implements Serializable {

	private String from;
    private String to;
    private String subject;
    private String body;
    private List<String> Mbody = new ArrayList<String>();
    
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
		return body;
	}
	
	
	public String getMultiBody() {
		// TODO Auto-generated method stub
		String delim = ",";
		
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		while (i < Mbody.size() -1)
		{
			sb.append(Mbody.get(i));
			sb.append(delim);
			i++;
		}
		sb.append(Mbody.get(i));  // Output: 1234,1235,1236
		return sb.toString();
	}

	public void setFrom(String from) {
		// TODO Auto-generated method stub
		this.from = from;
	}

	public void setTo(String to) {
		// TODO Auto-generated method stub
		this.to = to;
	}

	public void setSubject(String subject) {
		// TODO Auto-generated method stub
		this.subject = subject;
	}

	/*
	public void setBody(String body) {
		// TODO Auto-generated method stub
		this.body = body;
	}
	*/
}
