package com.alc4phase1challenge_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    private ProfileInfo mProfileInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);

        mProfileInfo = DataManager.getInstance().getProfileInfo();
        display(mProfileInfo);
    }

    private void display(ProfileInfo profileInfo) {
        ImageView imageView = findViewById(R.id.imageview_profile_picture);
        TextView name = findViewById(R.id.text_name);
        TextView track = findViewById(R.id.text_track);
        TextView country = findViewById(R.id.text_country);
        TextView email = findViewById(R.id.text_email);
        TextView phoneNumber = findViewById(R.id.text_phone_number);
        TextView slackUsername = findViewById(R.id.text_slack_username);

        String trackValue = track.getText() + "  " + mProfileInfo.getTrack();
        String countryValue = country.getText() + "  " + mProfileInfo.getCountry();
        String emailValue = email.getText() + "  " + mProfileInfo.getEmail();
        String phoneNumberValue = phoneNumber.getText() + "  " + mProfileInfo.getPhoneNumber();
        String slackUsernameValue = slackUsername.getText() + mProfileInfo.getUsername();

        name.setText(mProfileInfo.getName());
        track.setText(trackValue);
        country.setText(countryValue);
        email.setText(emailValue);
        phoneNumber.setText(phoneNumberValue);
        slackUsername.setText(slackUsernameValue);

        imageView.setImageResource(R.drawable.tamsanqa);
    }
}
