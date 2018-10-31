package com.github.thatlopesguy.internals.display;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Model of GBC display
 * <p>
 * Created by thatLopesGuy on 26/01/2018.
 */
public class LcdDisplay {
    private BufferedImage displayImage;
    private static final int WIDTH = 160;
    private static final int HEIGHT = 144;
    private int scale = 1;

    public LcdDisplay() {
        displayImage = new BufferedImage(WIDTH * scale, HEIGHT * scale, BufferedImage.TYPE_INT_ARGB);
    }

    public void setScale(int scale){
        this.scale = scale;
    }

    private void bufferImage(){
        for (int x = 0; x < displayImage.getWidth(); x++) {
            for (int y = 0; y < displayImage.getHeight(); y++) {
                displayImage.setRGB(x, y, Color.BLACK.getRGB());
            }
        }
    }

    public void paintPanel(Graphics g) {
        bufferImage();
        g.drawImage(displayImage, 0, 0, null);
    }

}
