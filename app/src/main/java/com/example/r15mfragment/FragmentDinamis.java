package com.example.r15mfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FragmentDinamis extends Fragment {

    public FragmentDinamis() {

    }

    public static FragmentDinamis newInstance() {
        return new FragmentDinamis();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootview = inflater.inflate(R.layout.fragment_dinamis, container, false);
        return rootview;
    }
}