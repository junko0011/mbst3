package com.example.mbst3;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

<<<<<<< HEAD:app/src/main/java/com/example/mbst3/healing/HealingFragment.java
import com.example.mbst3.R;

public class HealingFragment extends Fragment implements View.OnClickListener {

    public CardView card1;

=======
public class HealingFragment extends Fragment {
>>>>>>> parent of a1864d4... 힐링>카드뷰 xml 완성:app/src/main/java/com/example/mbst3/HealingFragment.java
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

