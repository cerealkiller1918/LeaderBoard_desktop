package com.justinfrasier.test;

import com.justinfrasier.Json.Json;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonTest {

    @Test
    public void currentWeek() throws Exception{
        Json json = new Json();
        json.getJsonFile();
        assertEquals(1,json.currentWeek());
    }
}
