package com.mfrag.liz;

import android.app.Application;

import com.orhanobut.hawk.Hawk;
import com.orhanobut.hawk.NoEncryption;

/**
 * CopyRights is Saved for mfrag.
 * This Java Class is Created by mfrag on 12/29/2018 for FlatLeafPic.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Hawk.init(getApplicationContext()).setEncryption(new NoEncryption()).build();
    }
}
