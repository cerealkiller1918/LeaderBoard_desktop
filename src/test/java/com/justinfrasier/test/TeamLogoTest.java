package com.justinfrasier.test;

import com.justinfrasier.picture.TeamLogo;
import org.junit.Before;
import org.junit.Test;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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


    public void checksThatBothMatch() throws IOException {
        URL url = new URL("http://justinfrasier.com/teamPic/ARI.png");
        BufferedImage image = ImageIO.read(url);
        assertEquals(image, uut.logo("ARI"));
    }

}
