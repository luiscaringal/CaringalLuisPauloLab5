package com.caringal.luispaulo;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyCustomService extends IntentService{

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyCustomService() {
        super("MyCustomService");
    }

    protected void onHandleIntent(@Nullable Intent intent){
        Log.d("4ITH","service is running...");
    }
}
