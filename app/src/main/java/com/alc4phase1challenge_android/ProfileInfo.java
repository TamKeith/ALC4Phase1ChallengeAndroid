package com.alc4phase1challenge_android;

public class ProfileInfo {
    private String mName;
    private String mTrack;
    private String mCountry;
    private String mEmail;
    private String mPhoneNumber;
    private String mUsername;
    private String mProfilePictureName;

    public ProfileInfo(String name, String track, String country, String email, String phoneNumber, String username, String profilePictureName) {
        mName = name;
        mTrack = track;
        mCountry = country;
        mEmail = email;
        mPhoneNumber = phoneNumber;
        mUsername = username;
        mProfilePictureName = profilePictureName;
    }

    public String getName() {
        return mName;
    }

    public String getTrack() {
        return mTrack;
    }

    public String getCountry() {
        return mCountry;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getUsername() {
        return mUsername;
    }

    public String getProfilePictureName() {
        return mProfilePictureName;
    }
}
