package com.justinfrasier.test;

import com.justinfrasier.emailValidation.EmailChecker;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class EmailTest {

    EmailChecker uut;
    @Before
    public void before(){
        uut = new EmailChecker();
    }

    @Test
    public void emailCheckWithEmailAddress(){
        assertEquals(true, uut.validate("cerealkiller1918@gmail.com"));
    }

    @Test
    public void emailCheckWithoutDot(){
        assertEquals(false, uut.validate("cerealkiller1918@gmailcom"));
    }

    @Test
    public void emailCheckWithoutAt(){
        assertEquals(false, uut.validate("cerealkiller1918gmail.com"));
    }
}
