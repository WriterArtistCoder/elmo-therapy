package gifs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.*;

/**
 * Parses String for emojis and calculates the correct GIF(s).
 * @author WriterArtistCoder
 * @author https://tinystripz.blogspot.com
 *
 */

public class GifSearcher {
	
	public static void main(String[] args) throws IOException {
		new GifSearcher().parseJSON(new File("src/main/resources/elmo-gifs.json"));
	}
	
	/**
	 * Scans a String for emojis.
	 * @param s The String to scan for emojis.
	 */
	public void scanForEmoji(String s) {
		for (char c : s.toCharArray()) {
			boolean isEmoji = true; // TODO check if char is emoji
			
			if (isEmoji) {
				
			}
		}
	}
	
	/**
	 * Parses the given GIF JSON file for the correct GIF.
	 * @param file The JSON file to parse.
	 * @throws IOException 
	 */
	public void parseJSON(File f) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("src/main/resources/elmo-gifs.json")));
		
		while (br.ready()) {
			System.out.println(br.readLine());
		}
	}
	
}

/**
 * A GIF, as represented in the JSON file.
 * @author WriterArtistCoder
 * @author https://tinystripz.com
 * 
 */
class Gif {
	String url;
	String emojis;
}
