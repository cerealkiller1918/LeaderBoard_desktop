package com.justinfrasier.test;

import com.justinfrasier.picture.TeamLogo;
import org.junit.Before;
import org.junit.Test;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

public class TeamLogoTest {

    TeamLogo uut;
    @Before
    public void before(){
        uut = new TeamLogo();
    }

    @Test
    public void checksThatItsNotNull(){
        assertNotNull(uut.logo("ARI"));
    }

    @Test
    public void checksThatBothMatch() throws IOException {
        URL url = new URL("http://justinfrasier.com/teamPic/ARI.png");
        BufferedImage image = ImageIO.read(url);
        byte[] test = ((DataBufferByte) image.getData().getDataBuffer()).getData();
        byte[] output = ((DataBufferByte) uut.logo("ARI").getData().getDataBuffer()).getData();
        assertArrayEquals(test,output);
    }

    @Test
    public void checkTheCatch(){
        assertNull(uut.logo("test"));
    }
}