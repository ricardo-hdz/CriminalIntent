package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by rhernande on 4/26/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
