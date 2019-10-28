package tweetMessageModel;

import java.io.Serializable;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tweetEntities.tweetMessageEntity;
import tweetResourceMessage.tweetResourse;
@ManagedBean(name = "tweetmessage")
@SessionScoped

public class TweetMessage implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	tweetResourse tweetResource=new tweetResourse();
	
	private String message;
	private Date dateModified;
	private Long id;
  
	tweetResource.tweetResourceMessage(message, message);

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public tweetMessageEntity getEntity()
	{
		tweetMessageEntity TweetMessageEntity = new tweetMessageEntity();
		TweetMessageEntity.setDateModified(dateModified);
		TweetMessageEntity.setId(id);
		TweetMessageEntity.setMessage(message);
		
		
		return TweetMessageEntity;
	}

}
