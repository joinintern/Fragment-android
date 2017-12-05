package com.fragmentlibrary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by APS1 on 29-06-2017.
 */

public class Helper {

    private static final Helper ourInstance = new Helper();

    public static Helper getInstance() {
        return ourInstance;
    }

    private Helper() {
    }

    public void moveFragment(Fragment fragment, String backStack, int containerId, AppCompatActivity activity) {

        if (fragment != null) {

            FragmentManager fragmentManager = activity.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(containerId, fragment);
            if (backStack != null)
                fragmentTransaction.addToBackStack(backStack);
            fragmentTransaction.commit();

        }
    }


}
