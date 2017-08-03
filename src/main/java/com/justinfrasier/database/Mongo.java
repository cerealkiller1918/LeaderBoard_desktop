package com.justinfrasier.database;


import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.mongodb.client.model.Filters.*;


public class Mongo {

    private MongoClient client;
    private MongoDatabase database;

    public Mongo(String url_mongo_db) {
        client = new MongoClient(url_mongo_db);
        database = client.getDatabase("leaderBoard");
    }

    public boolean checkIfUserNameIsBeingUsed(String username) {
        MongoCollection<Document> collection = getLoginCollection();
        Document document = collection.find(eq("username", username)).first();
        if(document == null) return false;
        else return true;
    }

    public boolean register(String userName, String hashPassword, String email){
        try {
            MongoCollection<Document> collection = getLoginCollection();
            Document doc = new Document("username", userName)
                    .append("password", hashPassword)
                    .append("email", email);
            collection.insertOne(doc);
            return true;
        }catch (Exception e){return false;}
    }

    public String getPassword(String userName){
        MongoCollection<Document> collection = getLoginCollection();
        Document document = collection.find(eq("username",userName)).first();
        return document.get("password").toString();
    }


    public void cleanForTest(String username){
        MongoCollection<Document>  collection = getLoginCollection();
        collection.deleteMany(eq("username", username));
    }

    private MongoCollection<Document> getLoginCollection(){
        return  database.getCollection("login");
    }
}
