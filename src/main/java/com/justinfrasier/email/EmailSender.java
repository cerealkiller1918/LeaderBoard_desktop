package com.justinfrasier.email;


import java.io.File;
import java.util.Properties;

public class EmailSender {

    private String USER_NAME;
    private String PASSWORD;
    private String[] TO = {"cerealkiller1918@gmail.com"};
    private String SUBJECT = "LOG FILE";
    private String fileNane;

    public EmailSender(String userName, String password, String fileName){
        USER_NAME = userName;
        PASSWORD = password;
        this.fileNane = fileName;
    }

    public void sendEmail(){
        Properties properties = System.getProperties();


    }

    private String getBody(){
        File file = new File(fileNane)
    }

}
