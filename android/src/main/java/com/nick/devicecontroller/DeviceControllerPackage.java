package com.nick.devicecontroller;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class DeviceControllerPackage implements ReactPackage {
    private List<NativeModule> modules = null;
    private Application application = null;
    
    public DeviceControllerPackage(Application application) {
        super();
        this.application = application;   
    }
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        modules = new ArrayList<>();
        modules.add(new DeviceControllerModule(reactContext, application));
        return modules;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
