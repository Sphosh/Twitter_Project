package tweetResourceMessage;

import java.util.List;

import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class tweetResourse {

	public tweetResourse() {
	}
	@SuppressWarnings("deprecation")
	public void tweetResourseMessage(String statusMessage, String queryMessage) throws TwitterException {

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("wrFrqWh51TAa6iZWTWjvIysd7")
		.setOAuthConsumerSecret("ZXra3M8RXHzkr47MvArcxzPhZXDPV04gs9blD8rqz6YjroCCeg")
		.setOAuthAccessToken("1181114875881443329-bXcYA6w2jpO6ysrbChMk41eJC9jtk7")
		.setOAuthAccessTokenSecret("mf2g2pMZ1RLxgtUyvLxEV9eJo4Yu84p46GOODjpk8TyID");
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter4j.Twitter twitter = tf.getInstance();	




		List<Status> status=twitter.getHomeTimeline();

		for(Status st:status)
		{
			System.out.println(st.getUser().getTimeZone()
					+"----------"+st.getUser().getName()+"----------"+st.getText());
			System.out.println(st.getId()+"----------"+st.getText());
			System.out.println(st.getCurrentUserRetweetId()+"----------"+st.getText());
			System.out.println(st.getLang()+"----------"+st.getText()); 

		} 

		// The factory instance is re-useable and thread safe.
		twitter = TwitterFactory.getSingleton();
		Status status1 = twitter.updateStatus(statusMessage);
		System.out.println("Successfully updated the status to [" + status1.getText() + "].");

		// Sending a direct message.
		Twitter sender = TwitterFactory.getSingleton();
		DirectMessage message = sender.sendDirectMessage(1L, statusMessage);
		System.out.println("Sent: "+ message.getText() + " to @" + message.getRecipientScreenName());



		// Searching a tweet messages
		twitter = TwitterFactory.getSingleton();
		Query query = new Query(queryMessage);
		QueryResult result = twitter.search(query);
		for (Status status11 : result.getTweets()) {
			System.out.println("@" + status11.getUser().getScreenName() + ":" + status11.getText());
		}

	}
}
