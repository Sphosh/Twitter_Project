package tweetEntities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;


@Entity(name="message_tbl")
public class tweetMessageEntity {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		
		private String message;
		private Date dateModified;
		private Long id;
		
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
		public Message remove(long id2) {
			
			this.id=id2;
			return null;
		}

}
