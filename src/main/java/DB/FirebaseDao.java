package main.java.DB;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import main.java.DB.error.FirebaseException;
import main.java.DB.error.JacksonUtilityException;
import main.java.DB.model.FirebaseResponse;
import main.java.DB.service.Firebase;

import java.io.FileInputStream;
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
/*

    public void saveReceipts(String userIdenticator ,List<Receipt> receipts) throws JacksonUtilityException, UnsupportedEncodingException, FirebaseException {
        final String userPath = "users";
        Map<String, Object> userReceiptsMap = new LinkedHashMap<String, Object>();
        userReceiptsMap.put(userIdenticator,receipts);
        firebase.put(userPath,userReceiptsMap);
    }

    public List<ApproveIdenticator> getApprovalIdenticators() throws UnsupportedEncodingException, FirebaseException {
        final String approveIdenticatorPath = "identcators/approve";
        response = firebase.get( approveIdenticatorPath );
        System.out.println( "\n\nResult of GET (for the test-PUT):\n" + response );
        System.out.println("\n");
    }


    public List<TotalIdenticator> getTotalIdenticators() throws UnsupportedEncodingException, FirebaseException {
        final String totalIdenticatorPath = "identcators/totals";
        response = firebase.get( totalIdenticatorPath );
        System.out.println( "\n\nResult of GET (for the test-PUT):\n" + response );
        System.out.println("\n");
    }
    */
}
