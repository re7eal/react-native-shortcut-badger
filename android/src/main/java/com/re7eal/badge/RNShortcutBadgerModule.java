package com.re7eal.badge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import me.leolin.shortcutbadger.ShortcutBadger;

public class RNShortcutBadgerModule extends ReactContextBaseJavaModule {

    public RNShortcutBadgerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "RNShortcutBadgerAndroid";
    }

    @ReactMethod
    public void setBadgesCount(int badgeCount) {
        ShortcutBadger.applyCount(getReactApplicationContext(), badgeCount);
    }
}
