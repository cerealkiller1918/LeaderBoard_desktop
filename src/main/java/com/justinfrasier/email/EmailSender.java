package com.justinfrasier.email;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

    public boolean sendEmail(){
        Properties properties = System.getProperties();

        return true;
    }

    private String getBody(){
        BufferedReader reader = null;
        String body ="";
        try {
            File file = new File(fileNane);
            if (file.exists()) {
                reader = new BufferedReader(new FileReader(file));
                String line;
                while((line=reader.readLine())!=null){
                    body += line;
                }
            }
        }catch (IOException e){ }
        finally {
            try {
                reader.close();
            }catch (IOException e){}
        }
        return body;
    }

}
