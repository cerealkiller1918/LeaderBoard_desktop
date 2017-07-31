package com.justinfrasier.email;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Email {

    //Emailing the Log File
    public boolean sendEmail(){
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        Session session = Session.getDefaultInstance(props,null);

        String to = "cerealkiller1918@gmail.com";
        String from = "cerealkiller1918@gmail.com";
        String subject = "Log";
        Message message = new MimeMessage(session);
        try{
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(subject);
            message.setText("Test 123456");
            Transport.send(message);
            return true;
        }catch (MessagingException e){
            return false;
        }
    }
}
