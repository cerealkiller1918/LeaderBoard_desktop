package com.justinfrasier.test;

import com.justinfrasier.Logger.Log;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;

public class LogTest {

    Log log;

    @Before
    public void setup(){
        log = new Log();
        log.close();
    }

    @Test
    public void checkForLogFile(){
        File file = new File(log.getFileName()+".log");
        assertTrue(file.exists());
    }

    @After
    public void after(){
        File file = new File(log.getFileName()+".log");
        if(file.exists()) file.delete();
    }
}
