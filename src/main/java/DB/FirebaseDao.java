package main.java.DB;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.FileInputStream;

public class FirebaseDao {

    public void start() throws Exception{
        FileInputStream serviceAccount =
                new FileInputStream("./serviceAccountKey.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://iorproject.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        Firestore db = FirestoreClient.getFirestore();

    }
}
