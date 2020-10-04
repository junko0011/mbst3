package com.example.mbst3.healing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mbst3.MainActivity;
import com.example.mbst3.R;

public class HealingCard1 extends HealingFragment {

    MainActivity mainActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ViewGroup rootview = (ViewGroup)inflater.inflate(R.layout.fragment_healing,container,false);
        return rootview;
    }
}


//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_healing_card1);
//
//    }

//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        myfragment =  inflater.inflate(R.layout.fragment_ussd, container, false);
//        //getting error at thus part "cannot resolve setcontentview"
//        l1=(ListView)myfragment.findViewById(R.id.listView);
//        l1.setAdapter(new dataListAdapter(t1,d1,i1));
//        return myfragment;
//    }


