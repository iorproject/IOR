package main.java.DB.demo;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import main.java.DB.MessageObject;
import main.java.DB.error.FirebaseException;
import main.java.DB.error.JacksonUtilityException;
import main.java.DB.model.FirebaseResponse;
import main.java.DB.service.Firebase;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class Demo {


	public static void main(String[] args) throws FirebaseException, JsonParseException, JsonMappingException, IOException, JacksonUtilityException {

		
		// get the base-url (ie: 'http://gamma.firebase.com/username')
		final String firebase_baseUrl = "https://iorproject.firebaseio.com/";

		// get the api-key (ie: 'tR7u9Sqt39qQauLzXmRycXag18Z2')
		final String firebase_apiKey = "AAAAFx7lSQ8:APA91bHgHuEV0G6OMtAzLdPdS0rHlE3EizFM_DuVQXvfgscTM-gbVeuIcLK3gZcLGIis2B1YkePVO0qC4rBwLGHsyEt57B5lKh6bSEg6-UiCN8yAekCZeZjTBQhjDnLZvvmXrpYRYzd2";


		// create the firebase
		Firebase firebase = new Firebase( firebase_baseUrl );


		// "DELETE" (the fb4jDemo-root)
		FirebaseResponse response;

        Map<String, Object> dataMap = new LinkedHashMap<String, Object>();
        List<String> dataMap2 = new LinkedList<String>();
        List<String> dataMap3 = new LinkedList<String>();
        List<String> dataMap4 = new LinkedList<String>();
        List<String> dataMap5 = new LinkedList<String>();


/*
		// "PUT" (test-map into the fb4jDemo-root)
		dataMap.put( "PUT-root", "This was PUT into the fb4jDemo-root" );
		response = firebase.put( dataMap );
		System.out.println( "\n\nResult of PUT (for the test-PUT to fb4jDemo-root):\n" + response );
		System.out.println("\n");


		// "GET" (the fb4jDemo-root)
		response = firebase.get();
		System.out.println( "\n\nResult of GET:\n" + response );
		System.out.println("\n");
*//*
            dataMap4.add("סה\"כ");
            dataMap4.add("סך הכל");
            dataMap4.add("סך-הכל");
            dataMap4.add("totals");
            dataMap4.add("total");

            dataMap3.add("total incl. tax");
            dataMap3.add("total incl. taxes");
            dataMap3.add("total include tax");
            dataMap3.add("total include taxes");


        dataMap2.add("מחיר סופי");
        dataMap2.add("order total");
        dataMap2.add("סכום");
        dataMap2.add("תשלום");
        dataMap2.add("סה\"כ מחיר");
        dataMap2.add("סה\"כ תקבולים");
        dataMap2.add("סה\"כ לתקבולים");
        dataMap2.add("סה\"כ כללי");
        dataMap2.add("סה\"כ לתשלום");
        dataMap2.add("סה\"כ תשלום");
        dataMap2.add("סך הכל מחיר");
        dataMap2.add("סך הכל לתקבולים");
        dataMap2.add("סך הכל תקבולים");
        dataMap2.add("סך הכל כללי");
        dataMap2.add("סך הכל לתשלום");
        dataMap2.add("סך הכל תשלום");
        dataMap2.add("סך-הכל מחיר");
        dataMap2.add("סך-הכל תקבולים");
        dataMap2.add("סך-הכל לתקבולים");
        dataMap2.add("סך-הכל כללי");
        dataMap2.add("סך-הכל לתשלום");
        dataMap2.add("סך-הכל תשלום");
        dataMap2.add("הסכום הכולל");
        dataMap2.add("סך-תשלום");

        dataMap5.add("מחיר סופי כולל מע\"מ");
        dataMap5.add("מחיר סופי כולל מיסים");
        dataMap5.add("order total incl. tax");
        dataMap5.add("order total incl. taxes");
        dataMap5.add("order total include taxes");
        dataMap5.add("order total include tax");
        dataMap5.add("סכום כולל מע\"מ");
        dataMap5.add("סכום כולל מיסים");
        dataMap5.add("תשלום כולל מע\"מ");
        dataMap5.add("תשלום כולל מיסים");
        dataMap5.add("סה\"כ מחיר כולל מע\"מ");
        dataMap5.add("סה\"כ מחיר כולל מיסים");
        dataMap5.add("סה\"כ תקבולים כולל מע\"מ");
        dataMap5.add("סה\"כ תקבולים כולל מיסים");
        dataMap5.add("סה\"כ לתקבולים כולל מיסים");
        dataMap5.add("סה\"כ לתקבולים כולל מע\"מ");
        dataMap5.add("סה\"כ כולל מיסים");
        dataMap5.add("סה\"כ כולל מע\"מ");
        dataMap5.add("סה\"כ כללי כולל מיסים");
        dataMap5.add("סה\"כ כללי כולל מע\"מ");
        dataMap5.add("סה\"כ לתשלום כולל מיסים");
        dataMap5.add("סה\"כ לתשלום כולל מע\"מ");
        dataMap5.add("סה\"כ תשלום כולל מיסים");
        dataMap5.add("סה\"כ תשלום כולל מע\"מ");
        dataMap5.add("סך הכל מחיר כולל מע\"מ");
        dataMap5.add("סך הכל מחיר כולל מיסים");
        dataMap5.add("סך הכל לתקבולים כולל מע\"מ");
        dataMap5.add("סך הכל לתקבולים כולל מיסים");
        dataMap5.add("סך הכל תקבולים כולל מע\"מ");
        dataMap5.add("סך הכל תקבולים כולל מיסים");
        dataMap5.add("סך הכל כולל מיסים");
        dataMap5.add("סך הכל כולל מע\"מ");
        dataMap5.add("סך הכל כללי כולל מיסים");
        dataMap5.add("סך הכל כולל מע\"מ");
        dataMap5.add("סך הכל כללי כולל מיסים");
        dataMap5.add("סך הכל כללי כולל מע\"מ");
        dataMap5.add("סך הכל כללי כולל מיסים");
        dataMap5.add("סך הכל כללי כולל מע\"מ");
        dataMap5.add("סך הכל לתשלום כולל מיסים");
        dataMap5.add("סך הכל לתשלום כולל מע\"מ");
        dataMap5.add("סך הכל תשלום כולל מיסים");
        dataMap5.add("סך הכל תשלום כולל מע\"מ");
        dataMap5.add("סך-הכל מחיר כולל מע\"מ");
        dataMap5.add("סך-הכל מחיר כולל מיסים");
        dataMap5.add("סך-הכל תקבולים כולל מע\"מ");
        dataMap5.add("סך-הכל לתקבולים כולל מע\"מ");
        dataMap5.add("סך-הכל תקבולים כולל מיסים");
        dataMap5.add("סך-הכל לתקבולים כולל מיסים");
        dataMap5.add("סך-הכל כולל מיסים");
        dataMap5.add("סך-הכל כולל מע\"מ");
        dataMap5.add("סך-הכל כללי כולל מיסים");
        dataMap5.add("סך-הכל כללי כולל מע\"מ");
        dataMap5.add("סך-הכל לתשלום כולל מיסים");
        dataMap5.add("סך-הכל לתשלום כולל מע\"מ");
        dataMap5.add("סך-הכל תשלום כולל מיסים");
        dataMap5.add("סך-הכל תשלום כולל מע\"מ");
        dataMap5.add("הסכום הכולל מיסים");
        dataMap5.add("הסכום הכולל מע\"מ");
        dataMap5.add("סך-תשלום כולל מיסים");
        dataMap5.add("סך-תשלום כולל מע\"מ");

        dataMap.put("10",dataMap2);
        dataMap.put("15",dataMap3);
        dataMap.put("5",dataMap4);
        dataMap.put("20",dataMap5);
        firebase.put( "Identicators/Totals", dataMap );*/
        response = firebase.get( "Identicators/Totals");
        System.out.println(response);
		// "PUT" (test-map into a sub-node off of the fb4jDemo-root)
/*
		dataMap = new LinkedHashMap<String, Object>();
		dataMap.put( "Key_1", "This is the first value" );
		dataMap.put( "Key_2", "This is value #2" );
		Map<String, Object> dataMap2 = new LinkedHashMap<String, Object>();
		dataMap2.put( "Sub-Key1", new MessageObject(1,"d") );
        System.out.println(dataMap.toString());
		dataMap.put( "Key_3", dataMap2);
		response = firebase.put( "test-PUT/Omer/", dataMap );
		System.out.println( "\n\nResult of PUT (for the test-PUT):\n" + response );
		System.out.println("\n");


		// "GET" (the test-PUT)
		response = firebase.get( "test-PUT" );
		System.out.println( "\n\nResult of GET (for the test-PUT):\n" + response );
		System.out.println("\n");


		// "POST" (test-map into a sub-node off of the fb4jDemo-root)
		response = firebase.post( "test-POST", dataMap );
		System.out.println( "\n\nResult of POST (for the test-POST):\n" + response );
		System.out.println("\n");


		// "DELETE" (it's own test-node)
		dataMap = new LinkedHashMap<String, Object>();
		dataMap.put( "DELETE", "This should not appear; should have been DELETED" );
		response = firebase.put( "test-DELETE", dataMap );
		System.out.println( "\n\nResult of PUT (for the test-DELETE):\n" + response );
		response = firebase.delete( "test-DELETE");
		System.out.println( "\n\nResult of DELETE (for the test-DELETE):\n" + response );
		response = firebase.get( "test-DELETE" );
		System.out.println( "\n\nResult of GET (for the test-DELETE):\n" + response );

		// Sign Up user for Firebase's Auth Service demo (https://firebase.google.com/docs/reference/rest/auth/)
		if(firebase_apiKey != null) {

			firebase = new Firebase(firebase_baseUrl, true);
			firebase.addQuery("key", firebase_apiKey);

			dataMap.clear();
			dataMap.put("email", "elonmusk@tesla.com");
			dataMap.put("password", "TeslaRocks");
			dataMap.put("returnSecureToken", true);

			response = firebase.post("signupNewUser", dataMap);
			System.out.println("\n\nResult of Signing Up:\n" + response);
			System.out.println("\n");

		} else {
			System.out.println("\n\nResult of Signing Up:\n failed, because no API Key was provided.");
			System.out.println("\n");
		}
*/

	}
	
}




