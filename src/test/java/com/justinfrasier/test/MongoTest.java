package com.justinfrasier.test;

import com.justinfrasier.database.Mongo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MongoTest {

    Mongo mongo;

    @Before
    public void setup(){
        mongo = new Mongo("localhost");
    }
    @Test
    public void registerTest(){
        mongo.cleanForTest("cerealkiller");
        assertTrue(mongo.register("cerealkiller","password","email"));
    }

    @Test
    public void checkUserNameIsClear(){
        assertFalse(mongo.checkIfUserNameIsBeingUsed("happy"));
    }

    @Test
    public void checkUserNameIsNotClear(){
        assertTrue(mongo.checkIfUserNameIsBeingUsed("cerealkiller"));
    }

    @Test
    public void getPasswordCheck(){
        assertEquals("password",mongo.getPassword("cerealkiller"));
    }
}
