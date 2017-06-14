package com.justinfrasier.Json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.justinfrasier.https.HTTPS;

public class Json {

    private JsonObject json;

    public void getJsonFile(){
        String url = "https://www.fantasyfootballnerd.com/service/schedule/json/yhnkisjxcbsm/";
        String s = new HTTPS().sendGet(url);
        json = new Gson().fromJson(s,JsonObject.class);
    }

    public int currentWeek(){
        String output = json.get("currentWeek").getAsString();
        return Integer.parseInt(output);
    }
}
