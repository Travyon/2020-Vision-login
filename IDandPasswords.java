package login;

import java.util.HashMap;

public class IDandPasswords {
/* Implementing a hash map because it is helpful
and stores key value pairs such as user name and 
password
*/
HashMap<String,String> logininfo = new HashMap<String,String>();
		
		/* This is the instantiated 
		method where the userID and 
		Password is created
		*/
IDandPasswords(){
		logininfo.put("Travyon", "Innovator");
		logininfo.put("Jeremiah", "Beaurocrat");
		logininfo.put("Taylor", "Organizer");
		logininfo.put("Regina", "PeaceMaker");
		logininfo.put("Logan", "Leader");
  }
	/* Want to set hash map to any class
	that request it so I created a getter
	method. If any one calls the method
	it will send them the login info.
	*/
protected HashMap<String, String> getLoginInfo(){
	return logininfo;
	}
}
