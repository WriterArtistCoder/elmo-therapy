package twitter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Parses API keys and returns a Twitter instance.
 * @author WriterArtistCoder
 * @author https://tinystripz.com
 *
 */

public class AuthParser {

	/**
	 * Parses the given API keys JSON file and generates a Twitter instance.
	 * @param file The JSON file to parse.
	 * @return A Twitter instance generated from the API keys in the JSON file.
	 * @throws IOException
	 * @throws ParseException
	 */
	public static Twitter getTwitterInstance(File file) throws IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(file));
		JSONObject json = (JSONObject) obj;
	    
	    ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey((String) json.get("api_key"))
			.setOAuthConsumerSecret((String) json.get("api_secret"))
			.setOAuthAccessToken((String) json.get("access_token"))
			.setOAuthAccessTokenSecret((String) json.get("access_secret"));
		
		System.out.println(json.get("api_key"));
		System.out.println(json.get("api_secret"));
		System.out.println(json.get("access_token"));
		System.out.println(json.get("access_secret"));

		TwitterFactory tf = new TwitterFactory(cb.build());
		return tf.getInstance();
	}
	
	/**
	 * Parses the default auth file (src/main/resources/auth.json) and generates a Twitter instance.
	 * @return A Twitter instance generated from the API keys in the JSON file.
	 * @throws IOException
	 * @throws ParseException 
	 */
	public static Twitter getTwitterInstance() throws IOException, ParseException {
		return getTwitterInstance(new File("src/main/resources/auth.json"));
	}

}

/**
 * The class created from parsing the JSON file.
 * @author WriterArtistCoder
 * @author https://tinystripz.com
 * 
 */
class Auth {
	String api_key;
	String api_secret;
	String access_token;
	String access_secret;
}
