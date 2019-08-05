package com.andela.kesegotumisang.travelmantics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FirebaseUtil {

    public static FirebaseDatabase mDatabase;
    public static DatabaseReference mDBReference;
    private static FirebaseUtil firebaseUtil;
    private static ArrayList<TravelDeal> mdeals;


    private  FirebaseUtil(){};

    public static void openFbReference(String refs){
        if ( firebaseUtil == null){
            firebaseUtil = new FirebaseUtil();
            mDatabase = FirebaseDatabase.getInstance();
            mdeals = new ArrayList<TravelDeal>();
        }

        mDBReference = mDatabase.getReference().child(refs);
    }
}
