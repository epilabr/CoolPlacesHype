package com.cool.places.hype;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.support.v7.app.AlertDialog;

/**
 * Created by Laptop on 13-Feb-17.
 */

public class IsNetworkConnected {

    Context mContext;


    public IsNetworkConnected(Context mContext) { //checks to see if there is an active connection to internet
                                                    //and displays appropriate message if not
            this.mContext = mContext;


    }

    public void isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        boolean internet = cm.getActiveNetworkInfo() != null;

        if (!internet){
            AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
            alertDialog.setTitle(mContext.getString(R.string.noInternetConnection));
            alertDialog.setMessage(mContext.getString(R.string.noInternetConnectionRational));
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();  //show message to connect to internet
        }
    }
}
