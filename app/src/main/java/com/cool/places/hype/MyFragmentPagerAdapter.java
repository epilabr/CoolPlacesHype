package com.cool.places.hype;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/*=========this class is for the pager adapter==================*/
public class MyFragmentPagerAdapter extends FragmentPagerAdapter{


    MyFragmentPagerAdapter(FragmentManager fm) { //pager adapter to use the swipe motion in phone custom App
        super(fm);
    }




    @Override
    public Fragment getItem(int position) { //receives position and returns the corresponding fragment

            if (position == 0) {
                return new SearchFragment();
            } else
                return new FavoritesFragment();

    }



    @Override
    public int getCount() {
        return 2;
    }

}


