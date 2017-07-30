package com.justinfrasier.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    private BufferedWriter writer;
    private String fileName;
    public Log(){
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmm");
            Date date = new Date();
            fileName = dateFormat.format(date);
            FileWriter fileWriter = new FileWriter(fileName + ".log");
            writer = new BufferedWriter(fileWriter);
            writer.write("Log File \n"+fileName+'\n');
        }catch (IOException e){}
    }


    public void writeln(String string){
        try {
            writer.write(string+'\n');
        } catch (IOException e){}
    }

    public void close(){
        try {
            writer.flush();
            writer.close();
        }catch (IOException e){}
    }

    public String getFileName() {
        return fileName;
    }
}
