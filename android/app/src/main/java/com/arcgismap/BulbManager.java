package com.arcgismap;


import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class BulbManager extends SimpleViewManager<BulbView> {

    @NonNull
    @Override
    public String getName() {
        return "Bulb";
    }

    @NonNull
    @Override
    protected BulbView createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new BulbView(reactContext);
    }
}
