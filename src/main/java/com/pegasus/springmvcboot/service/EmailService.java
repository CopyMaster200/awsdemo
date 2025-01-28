package com.pegasus.springmvcboot.service;

import jakarta.mail.MessagingException;
import org.springframework.web.multipart.MultipartFile;

public interface EmailService {
    public void sendSimpleMessage(String to, String subject, String text, MultipartFile file) throws MessagingException;
}
