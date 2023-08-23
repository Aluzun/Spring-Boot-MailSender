package com.springboot.springbootmailapp;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.Message;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

/*@RestController
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
}*/

@RestController
public class EmailController {
	private JavaMailSender mailSender;
	
	@Autowired
	public EmailController(JavaMailSender mailSender) {
		this.mailSender= mailSender;
	}
	
	
	@RequestMapping(value = "/send-email", method = RequestMethod.POST, consumes = "application/json")
	public void sendMailWithAttachment(@RequestBody EmailRequest emailRequest) {

		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			
			public void prepare(MimeMessage mimeMessage) throws Exception {
		
				mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(emailRequest.getTo()));
				mimeMessage.setFrom(new InternetAddress(emailRequest.getFrom()));
				mimeMessage.setSubject(emailRequest.getSubject());
				mimeMessage.setText(emailRequest.getBody());
				mimeMessage.setFileName(emailRequest.fileToAttach());
		
				FileSystemResource file = new FileSystemResource(new File(emailRequest.fileToAttach()));
				MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
				helper.addAttachment("attachment", file);
			}
		};
		
		try {
			mailSender.send(preparator);
		}
		
		catch (MailException ex) {
			System.err.println(ex.getMessage());
		}
		
	}
}
	
	


	
