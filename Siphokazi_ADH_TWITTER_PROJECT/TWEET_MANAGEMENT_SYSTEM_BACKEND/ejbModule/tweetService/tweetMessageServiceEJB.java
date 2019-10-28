package tweetService;

import java.util.List;

import javax.ejb.LocalBean;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import tweetEntities.tweetMessageEntity;

/**
 * Session Bean implementation class tweetMessageServiceEJB
 */
@Stateless
@LocalBean
public class tweetMessageServiceEJB {

	@PersistenceContext
	private EntityManager em;

	static tweetMessageEntity tweetMessage=new tweetMessageEntity();

	public tweetMessageServiceEJB() {

	}

	public void addNew(tweetMessageEntity tweetMessageEntity)
	{
		System.out.println("============================");
		System.out.println(tweetMessageEntity.getMessage());
		em.persist(tweetMessageEntity);
		System.out.println("============================");
	}

	@SuppressWarnings("unchecked")
	public static Message getMessage(long id) {

		return ((List<Message>) tweetMessage).get(id);
	}

	private static Message get(long id) {

		return null;
	}

	public static Message addMessage(Message message) {

		return null;
	}

	public static Message removeMessage(long id) {

		return tweetMessage.remove(id);
	}

	public static List<Message> getAllMessages() {

		return null;
	}
	public Message updateMessage(Message message) {	
		if(((tweetMessageEntity) message).getId()<=0) {

			return null;
		}
		//((Object) message).put(((tweetMessageEntity) message).getId(),message);
		return message;	
	}


}
