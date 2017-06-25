package com.justinfrasier.picture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class TeamLogo {

    public BufferedImage logo(String team){
        try {
            URL url = new URL("http://justinfrasier.com/teamPic/" + team + ".png");
            BufferedImage img = ImageIO.read(url);
            return img;
        }catch (IOException e){
            System.out.println("Logo");
            e.printStackTrace();
            return null;
        }
    }
}
