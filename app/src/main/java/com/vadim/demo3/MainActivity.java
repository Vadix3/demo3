package com.vadim.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myTag";
    public static final String AF_PURCHASE = "af_purchase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testEvent();
    }

    /**
     * A method to test event
     */
    private void testEvent() {
        Log.d(TAG, "testEvent: ");
        Map<String, Object> eventData = new HashMap<>();
        eventData.put("Key1", "Value1");
        eventData.put("Key2", "Value2");
        eventData.put("Key3", "Value3");
        AppsFlyerLib.getInstance().logEvent(getApplicationContext(), AF_PURCHASE, eventData);
    }
}