package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
	private static char WHITE;
	private static char BLACK;
	private static BufferedImage image;


	public static void main (String[] args) {
		parserArgs(args);
		new Logic(WHITE, BLACK).printChar(image);
	}
	
	private static void parserArgs(String[] args) {
		if (args.length != 3) {
			System.err.println("Usage: program_name <char for white pixel> <char for black pixel> <full path to image>");
			System.exit(-1);
		}
		WHITE = args[0].charAt(0);
		BLACK = args[1].charAt(0);
		try {
			image = ImageIO.read(new File(args[2]));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

