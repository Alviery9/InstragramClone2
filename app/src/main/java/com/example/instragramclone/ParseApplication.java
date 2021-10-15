package com.example.instragramclone;

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
                .applicationId("R9cHzWzF7X0crewpheCiYisb45xhCZdN54Yejd6j")
                .clientKey("8miTJiWJcpyd6RbKT5w0LNtUXGYOeirGMzDLyePP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
