package valmx.nelly.studienfahrtapp.data;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.LinkedList;

import valmx.nelly.studienfahrtapp.MainActivity;
import valmx.nelly.studienfahrtapp.containers.Card;

public class DataManager {
    private LinkedList<Card> cards;
    private boolean isTripLoaded = false;
    private MainActivity activity;
    private SharedPreferences pref;
    public static  String SHARED_PREF = "EVSA";

    public DataManager(MainActivity activity) {
        this.activity = activity;
        pref = activity.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);

        isTripLoaded = pref.getBoolean("isTripLoaded",false);
    }

    public boolean isTripLoaded() {
        return isTripLoaded;
    }

    public void setTripLoaded(boolean tripLoaded) {
        // TODO: 22.09.2020 add save feature 
        isTripLoaded = tripLoaded;
    }
}
