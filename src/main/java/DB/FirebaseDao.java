package main.java.DB;

import com.google.gson.Gson;
import dbObjects.ApproveIndicator;
import main.java.DB.Entities.TotalIndicator;
import main.java.DB.error.FirebaseException;
import main.java.DB.error.JacksonUtilityException;
import main.java.DB.model.FirebaseResponse;
import main.java.DB.service.Firebase;

import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirebaseDao {
    private static FirebaseDao firebaseDao = null;
    final String firebase_baseUrl = "https://iorproject.firebaseio.com/";
    final String firebase_apiKey = "AAAAFx7lSQ8:APA91bHgHuEV0G6OMtAzLdPdS0rHlE3EizFM_DuVQXvfgscTM-gbVeuIcLK3gZcLGIis2B1YkePVO0qC4rBwLGHsyEt57B5lKh6bSEg6-UiCN8yAekCZeZjTBQhjDnLZvvmXrpYRYzd2";
    private Firebase firebase;
    private FirebaseResponse response;

    private FirebaseDao() throws FirebaseException {
        firebase = new Firebase( firebase_baseUrl);
    }
    public static FirebaseDao getInstance() throws FirebaseException {
        if(firebaseDao == null){
            firebaseDao = new FirebaseDao();
        }
        return firebaseDao;
    }


    public void saveReceipts(String userIdenticator ,List<Receipt> receipts) throws JacksonUtilityException, UnsupportedEncodingException, FirebaseException {
        final String userPath = "users";
        Map<String, Object> userReceiptsMap = new LinkedHashMap<String, Object>();
        userReceiptsMap.put(userIdenticator,receipts);
        firebase.put(userPath,userReceiptsMap);
    }

    public List<ApproveIndicator> getApprovalIndicators() throws UnsupportedEncodingException, FirebaseException {
        final String approveIdenticatorPath = "identcators/approve";
        response = firebase.get( approveIdenticatorPath );
        System.out.println( "\n\nResult of GET (for the test-PUT):\n" + response );
        System.out.println("\n");
        return null;
    }


    public TotalIndicator getTotalIndicator() throws UnsupportedEncodingException, FirebaseException {
        final String totalIndicatorPath = "identcators/totals/5";
        response = firebase.get( totalIndicatorPath );
        System.out.println( "\n\nResult of GET (for the test-PUT):\n" + response );
        System.out.println("\n");
        Gson json = new Gson();
        return json.fromJson(response.toString(),TotalIndicator.class);
    }

}
