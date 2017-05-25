package com.will.practice;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageGrayTest {
	
	public static void main(String[] args) {
		File baseDir = new File(System.getProperty("user.dir"));
		File sourceFile = new File(baseDir, "./resource/java.png");
		File outputfile = new File(baseDir, "./resource/java_gray.png");
		try {
			if(outputfile.exists()) {
				outputfile.delete();
			}
			BufferedImage sourceImage = ImageIO.read(sourceFile);
			BufferedImage bi = new BufferedImage(sourceImage.getWidth(null), sourceImage.getHeight(null), BufferedImage.TYPE_BYTE_GRAY);
			Graphics g = bi.getGraphics();
			g.drawImage(sourceImage, 0, 0, null);
			g.dispose();
			ImageIO.write(bi, "png", outputfile);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}