package com.justinfrasier.storage;

import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;

public class MakeJsonFile {

    public boolean makeJsonFile(String user, String hashPassword, int lastGame, String fileName){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("UserName",user);
        jsonObject.addProperty("PassHash", hashPassword);
        jsonObject.addProperty("LastGameLookAt", lastGame);

        try{
           FileWriter file = new FileWriter(fileName);
           file.write(jsonObject.toString());
           file.flush();
           file.close();
           return true;
        } catch (IOException e) {
            return false;
        }
    }
}
