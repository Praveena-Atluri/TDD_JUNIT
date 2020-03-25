package epam.Hometask;

public class Remove {

	public String RemoveFirst(String string) {
		
 if(string.charAt(0)=='A' && string.charAt(1)=='A')
	        string=string.substring(2);
   else if(string.charAt(1)=='A')
	             string=string.substring(0,1)+string.substring(2);

   else if(string.charAt(0)=='A')
       string=string.substring(1);
	
		
		return   string;
	}

}