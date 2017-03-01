package com.cool.places.hype;

/*===this class shows the Place object and its different fields===*/

import android.graphics.Bitmap;
import android.widget.ImageView;

public class Place {

    String name;
    String address;
    String latitude;
    String longitude;
    String  photoImage;
    byte[]  picToSaveByteArray;
    Bitmap  picToLoadByteArray;
    ImageView v;


    public Place(String name, String address, String latitude, String longitude, String photoImage) {  //constructor...

        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.photoImage = photoImage;
    }

    public Place(String name, String address, String latitude, String longitude, byte[] picToSaveByteArray) {  //constructor...

        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.picToSaveByteArray = picToSaveByteArray;
    }

    public Place(String name, String address, String latitude, String longitude, Bitmap picToLoadByteArray) {  //constructor...

        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.picToLoadByteArray = picToLoadByteArray;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
