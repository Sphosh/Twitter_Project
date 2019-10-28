package tweetMessageController;

import java.util.ArrayList;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


import tweetMessageModel.TweetMessage;
import tweetResourceMessage.tweetResourse;
import tweetService.tweetMessageServiceEJB;

@ManagedBean(name = "tweetMessageController")
@SessionScoped
public class TweetMessageController {

	@EJB
	private tweetMessageServiceEJB tweetmessageServiceEJB;
	
	
    tweetResourse tweetResource=new tweetResourse();
	@ManagedProperty(value="#{tweetmessage}")
	private TweetMessage tweetMessage;
    
	private List<TweetMessage> tweetMessageList = new ArrayList<>();

	public List<TweetMessage> getEmployeeList() {
		// tweetMessageList = tweetMessageServiceEJB.findtweets();
		return tweetMessageList;
	}

	public String addNewTweet() {
		tweetmessageServiceEJB.addNew(tweetMessage.getEntity());

		return "tweetList.xhtml";
	}

	public TweetMessage getTweet() {
		return tweetMessage;
	}

	public void setTweet(TweetMessage tweetMessage) {
		this.tweetMessage = tweetMessage;

	
	}
	

}