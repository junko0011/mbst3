package com.example.mbst3.healing;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.mbst3.R;

public class HealingFragment extends Fragment implements View.OnClickListener {

    public CardView card1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_healing,container,false);

        //fragment 는 findViewById 할수 없으므로 View 객체에 담는다
        View v= inflater.inflate(R.layout.fragment_healing,container, false);
        CardView card1 = (CardView) v.findViewById(R.id.healing_card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;


    }




    }

