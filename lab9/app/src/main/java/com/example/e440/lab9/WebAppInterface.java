package com.example.e440.lab9;

import android.app.Activity;
import android.content.Context;
import android.os.Message;
import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by e440 on 05-06-18.
 */

public class WebAppInterface {
    Context mContext;

    WebAppInterface(Context c){

        mContext=c;
    }

    @JavascriptInterface
    void consoleMessage(String s){
        Log.d("App:",s);

    }
    void finishActivity(){
        Activity a=(Activity)mContext;
        a.finish();
    }


}
