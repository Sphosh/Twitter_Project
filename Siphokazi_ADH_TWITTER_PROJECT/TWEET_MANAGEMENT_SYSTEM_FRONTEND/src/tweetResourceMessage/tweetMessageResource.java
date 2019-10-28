package tweetResourceMessage;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import tweetEntities.tweetMessageEntity;
import tweetService.tweetMessageServiceEJB;

public class tweetMessageResource {

	@Path("/messages")
	public class MessageResource {

		tweetMessageEntity tweet=new tweetMessageEntity();
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Message> getMessages() {	
			return  tweetMessageServiceEJB.getAllMessages();
		}

		@GET
		@Path("/{messageId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Message getMessages(@PathParam("messageId")long id) {

			return  tweetMessageServiceEJB.getMessage(id);
		}

		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Message addMessage(Message message) {

			return tweetMessageServiceEJB.addMessage(message);
		}

		@PUT
		@Path("/{messageId}")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Message updateMessage(@PathParam("messageId")long id,Message message) {

			return tweetMessageServiceEJB.addMessage(message);
		}


		@DELETE
		@Path("/{messageId}")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Message deleteMessage(@PathParam("messageId")long id) {

			return tweetMessageServiceEJB.removeMessage(id);	
		}

	}

}
