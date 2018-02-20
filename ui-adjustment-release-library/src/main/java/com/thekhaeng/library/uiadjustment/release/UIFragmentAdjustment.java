package com.thekhaeng.library.uiadjustment.release;

import android.support.v4.app.Fragment;
import android.view.View;

import com.thekhaeng.library.uiadjustment.core.UIAdjustmentInterface;

/**
 * Created by The Khaeng on 15 Feb 2018 :)
 */

public abstract class UIFragmentAdjustment<A extends Fragment> implements UIAdjustmentInterface{


    public UIFragmentAdjustment( A fragment, View button ){
        button.setVisibility( View.GONE );
    }


    @Override
    public UIAdjustmentInterface setDelayMillisTime( long delay ){
        return this;
    }

    @Override
    public UIAdjustmentInterface setUseLocalStorage( boolean useLocalStorage, boolean bindDataImmediately ){
        return this;
    }


}