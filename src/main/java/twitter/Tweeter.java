package twitter;
import java.io.File;
import java.io.IOException;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;

/**
 * Handles the actual tweeting.
 * @author WriterArtistCoder
 * @author https://tinystripz.com
 * 
 */

public class Tweeter {

	public static void main(String[] args) {
		try {
			Twitter t = AuthParser.getTwitterInstance();
			StatusUpdate s = new StatusUpdate("this is an update");
			
			// TODO The following two lines are breaking my code, because of authentication errors!
			t.uploadMedia(new File("src/main/resources/cc0-cat.jpeg"));
			t.updateStatus("this is an update");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TwitterException e) {
			e.printStackTrace();
		}
	}

}
