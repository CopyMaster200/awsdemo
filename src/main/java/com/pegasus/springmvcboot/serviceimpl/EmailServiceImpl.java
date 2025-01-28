package com.pegasus.springmvcboot.serviceimpl;

import com.pegasus.springmvcboot.service.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Service
public class EmailServiceImpl implements EmailService {
    @Value("${spring.mail.username}")
    private String from;
    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String to, String subject, String text, MultipartFile file) throws MessagingException {
        // Create a MimeMessage using JavaMailSender
        MimeMessage message = emailSender.createMimeMessage();

        // Using MimeMessageHelper to simplify the process
        MimeMessageHelper helper = new MimeMessageHelper(message, true);  // true for multipart

        // Set From: header field
        helper.setFrom(from);  // Use the email you want to send from

        // Set To: header field
        helper.setTo(to);

        // Set Subject: header field
        helper.setSubject(subject);

        // Set the message body
        helper.setText(text);

        // Add the file attachment from the MultipartFile
        if (file != null && !file.isEmpty()) {
            helper.addAttachment(file.getOriginalFilename(), file);
        }

        try {
            // Send message
            emailSender.send(message);
            System.out.println("Email Sent Successfully with attachment!");
        } catch (Exception exception) {
            log.error("Email sent failed.", exception);
        }
    }

}
