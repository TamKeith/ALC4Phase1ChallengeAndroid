package com.alc4phase1challenge_android;

public class DataManager {

    private static DataManager ourInstance = null;
    private ProfileInfo mProfileInfo;


    public static DataManager getInstance() {
        if(ourInstance == null) {
            ourInstance = new DataManager();
            ourInstance.initializeProfile();
        }
        return ourInstance;
    }

    private DataManager() {
    }

    private void initializeProfile() {
        mProfileInfo = new ProfileInfo("Tamsanqa Keith Ncube", "Android", "Zimbabwe", "tamkeithncube@gmail.com",
                "+263774408848", "Tamsanqa Keith Ncube", "tamsanqa.jpg");

    }

    public ProfileInfo getProfileInfo() {
        return mProfileInfo;
    }
}
