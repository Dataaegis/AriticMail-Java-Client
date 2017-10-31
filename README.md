# ariticmail-java
Java Client API for the AritiCMail

Currently the client supports two basic operations - Send and SendRaw - the other API functions for accessing messages will be added at a later date.

Usage of the API is simple:

            Ariticmail ariticmail = new Ariticmail("<<POSTAL_SERVER_URL>>", "API_KEY");
 
            SendMessage message = new SendMessage();
              message.setFrom("example@domain.tld");
              message.addTo("user@domain.tld");
              message.setSubject("This is an API example!");
              message.setPlainBody("This is the plain body.  Very plain.");
        
            ariticmail.sendMessage(message);
        
