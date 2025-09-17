package com.external.mail.sendingMail.service;

import com.external.mail.sendingMail.pojo.EmailDetails;

public interface EmailService {
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
