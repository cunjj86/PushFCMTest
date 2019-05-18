package com.tje.pushfcmtest.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyMessageService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);

        Log.d("새 토큰", s);
    }
}
