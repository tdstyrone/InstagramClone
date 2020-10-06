package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kpbDughX9ht8ZTd9IjxU6pZ3NvVPyMGRiQxNIrTR")
                .clientKey("24VJ2c4mtvVhRqMBxTSXNpn4886TNQGJ1VIIVFJ5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
