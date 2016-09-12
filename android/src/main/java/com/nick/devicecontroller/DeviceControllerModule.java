package com.nick.devicecontroller;

import android.content.Context;
import android.widget.Toast;
import android.content.pm.ActivityInfo;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewManager;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeviceControllerModule extends ReactContextBaseJavaModule {

    private Context mContext;
    public DeviceControllerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    
    @Override
    public String getName() {
        return "DeviceContollerModule";
    }
    
    @ReactMethod
    public void setOrientation(int mode) {
        //activity.setRequestedOrientation(mode);
    }
    
}
