package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.printf ("Analysing Image...\n");
        String path = args[0]; //"/Users/Wilkinson/Copy/dev/imageProcessing/5x5.gif";
        BufferedImage image = ImageIO.read(new File(path));
        System.out.printf ("Image Buffered.\n");
        int blackcount = 0;
        int thresholdBlack = 40;
        int w = image.getWidth();
        int h = image.getHeight();
        for(int y = 0; y < h; y++) {
            for(int x = 0; x < w; x++) {
                Color mycolor = new Color(image.getRGB(x, y));
                // is this pixel Black
                // i.e. red, green and blue are all less than 40 where black is 0, 0, 0.

                if (mycolor.getRed() < thresholdBlack &&
                        mycolor.getGreen() < thresholdBlack &&
                        mycolor.getBlue() < thresholdBlack)
                {
                    blackcount++;
                }
                System.out.printf (x + " - " + y + " Red: " + mycolor.getRed() + " Green: " + mycolor.getGreen() + " Blue: " + mycolor.getBlue() + " - Black count = " + blackcount + "\n");
                /*int pixel = image.getRGB(x, y);
                if(pixel == red)   redCount++;
                if(pixel == green) greenCount++;
                if(pixel == blue)  blueCount++;*/
            }
        }
        System.out.printf ("\nProcessing Complete.");
    }

}
