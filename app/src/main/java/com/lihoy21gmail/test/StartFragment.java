package com.lihoy21gmail.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StartFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.start_fragment, null);
        Button btStart = (Button) v.findViewById(R.id.btStart);
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Main) getActivity()).change_fragment();
            }
        });
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int SomeInt = getArguments().getInt("someInt", 0);
    }

    public static StartFragment newInstance(int someInt) {
        StartFragment startFragment = new StartFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", someInt);
        startFragment.setArguments(args);
        return startFragment;
    }
}