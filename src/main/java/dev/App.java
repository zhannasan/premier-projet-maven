package dev;

import com.github.lalyos.jfiglet.FigletFont;
/**
 * Hello world!
 *
 */
public class App {
	  public static void main(String[] args) {
	    String asciiArt = FigletFont.convertOneLine("Hello World!");
	    System.out.println(asciiArt);
	    String asciiArt2 = FigletFont.convertOneLine("Wonderful!");
	    System.out.println(asciiArt2);
	  }
	}
