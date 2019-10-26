import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Parses a config file and returns a Twitter instance.
 * @author WriterArtistCoder
 * @author https://tinystripz.blogspot.com
 *
 */
public class ConfigParser {

	/**
	 * Parses the given config file and generates a Twitter instance.
	 * @return 
	 * @param file
	 * @return A Twitter instance generated from the API keys in the config file.
	 * @throws IOException
	 */
	public static Twitter getTwitterInstance(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		GsonBuilder builder = new GsonBuilder(); 
	    builder.setPrettyPrinting();
	    
	    Gson gson = builder.create();
	    Config config = gson.fromJson(br, Config.class);
	    
	    ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey(config.api_key)
			.setOAuthConsumerSecret(config.api_secret)
			.setOAuthAccessToken(config.access_token)
			.setOAuthAccessTokenSecret(config.access_secret);
		
		System.out.println(config.api_key);
		System.out.println(config.api_secret);
		System.out.println(config.access_token);
		System.out.println(config.access_secret);

		TwitterFactory tf = new TwitterFactory(cb.build());
		br.close();
		
		return tf.getInstance();
	}
	
	/**
	 * Parses the default config file (src/main/resources/config.json) and generates a Twitter instance.
	 * @return A Twitter instance generated from the API keys in the config file.
	 * @throws IOException
	 */
	public static Twitter getTwitterInstance() throws IOException {
		return getTwitterInstance(new File("src/main/resources/config.json"));
	}

}

class Config {
	String api_key;
	String api_secret;
	String access_token;
	String access_secret;
}
