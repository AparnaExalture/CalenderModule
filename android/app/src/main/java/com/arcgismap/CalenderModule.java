package com.arcgismap;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CalenderModule extends ReactContextBaseJavaModule {
    @NonNull
    @Override
    public String getName() {
        return "CalenderModule";
    }
    @ReactMethod
    public void createCalendarEvent(String name, String location) {
        Log.d("CalendarModule", "Create event called with name: " + name
                + " and location: " + location);
    }
    CalenderModule(ReactApplicationContext context) {
        super(context);
    }
}
