package com.justinfrasier.picture;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import static javax.imageio.ImageIO.*;

public class TeamLogo {

    public BufferedImage logo(String team){
        try {
            URL url = new URL("http://justinfrasier.com/teamPic/" + team + ".png");
            BufferedImage img = read(url);
            return img;
        }catch (IOException e){
            return null;
        }
    }
}
