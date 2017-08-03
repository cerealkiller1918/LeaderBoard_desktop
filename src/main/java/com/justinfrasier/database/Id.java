package com.justinfrasier.database;

import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class Id {

    public boolean save(String id, String userName, String hashPassword){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id",id);
        jsonObject.addProperty("username", userName);
        jsonObject.addProperty("password", hashPassword);
        try {
            FileWriter file = new FileWriter("id.json");
            file.write(jsonObject.toString());
            file.flush();
            file.close();
            return true;
        }catch (IOException e){
            return false;
        }
    }
}
