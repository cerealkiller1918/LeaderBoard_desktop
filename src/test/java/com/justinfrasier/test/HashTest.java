package com.justinfrasier.test;

import com.justinfrasier.password.HashPassword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HashTest {

    HashPassword uut;
    @Before
    public void before(){
        uut = new HashPassword();
    }

    @Test
    public void hashPasswordTest(){
        String expected = "b8be6cae5215c93784b1b9e2c06384910f754b1d66c077f1f8fdc98fbd92e6c17a0fdc790b30225986cadb9553e87a47b1d2eb7bd986f96f0da7873e1b2ddf9c";
        assertEquals(expected, uut.get_SHA_512_SecurePassward("test","12345"));
    }
}
