package com.example.greenomy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_store extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_store, container, false);

        ImageButton m_btn;
        ImageView imageView;
        ImageView imageView2;
        boolean i = true;


        protected void onCreate( Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_store);

            m_btn = getView().findViewById(R.id.imageButton);
            imageView = getView().findViewById(R.id.image_view);
            imageView2 = getView().findViewById(R.id.image_view2);

            m_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (i == true){
                        imageView.setImageResource(R.drawable.a2);
                        imageView2.setImageResource(R.drawable.after);
                        i = false;
                    }else {
                        imageView.setImageResource(R.drawable.a1);
                        imageView2.setImageResource(R.drawable.before);
                        i = true;
                    }
                }
            });

        }

    }
}
