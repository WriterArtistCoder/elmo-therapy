import java.io.IOException;

import twitter4j.Twitter;
import twitter4j.TwitterException;

/**
 * Does the actual tweeting. GifSearcher passes in the GIF to tweet.
 * @author WriterArtistCoder
 * @author https://tinystripz.blogspot.com
 *
 */

public class Tweeter {

	public static void main(String[] args) {
		Twitter t;
		try {
			t = ConfigParser.getTwitterInstance();
			t.updateStatus("https://media.giphy.com/media/oubM1tKqnLW5G/giphy.gif");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

}
