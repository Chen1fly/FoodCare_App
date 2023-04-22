package com.food1.ui.dashboard;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.food1.R;
import com.food1.databinding.FragmentDashboardBinding;
import com.food1.ui.home.HomeFragment;
import com.google.android.material.navigation.NavigationView;

import java.io.IOException;

public class DashboardFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_dashboard, container, false);
        Button btn_pr = inflate.findViewById(R.id.btn_pr);
        Button btn_kid = inflate.findViewById(R.id.btn_kid);
        Button btn_old = inflate.findViewById(R.id.btn_old);

        ImageView imageView = inflate.findViewById(R.id.dash_pic);
        ImageView imageView1 = inflate.findViewById(R.id.dash_pic1);
        ImageView imageView2 = inflate.findViewById(R.id.dash_pic2);
        ImageView imageView3 = inflate.findViewById(R.id.dash_pic3);
        ImageView imageView4 = inflate.findViewById(R.id.dash_pic4);
        ImageView imageView5 = inflate.findViewById(R.id.dash_pic5);
        ImageView imageView6 = inflate.findViewById(R.id.dash_pic6);
        ImageView imageView7 = inflate.findViewById(R.id.dash_pic7);
        ImageView imageView8 = inflate.findViewById(R.id.dash_pic8);
        ImageView imageView9 = inflate.findViewById(R.id.dash_pic9);
        ImageView imageView10 = inflate.findViewById(R.id.dash_pic10);
        ImageView imageView11 = inflate.findViewById(R.id.dash_pic11);
        ImageView imageView12 = inflate.findViewById(R.id.dash_pic12);
        ImageView imageView13 = inflate.findViewById(R.id.dash_pic13);
        ImageView imageView14 = inflate.findViewById(R.id.dash_pic14);

        TextView textView = inflate.findViewById(R.id.text_dash);
        TextView textView1 = inflate.findViewById(R.id.text_dash1);
        TextView textView2 = inflate.findViewById(R.id.text_dash2);
        TextView textView3 = inflate.findViewById(R.id.text_dash3);
        TextView textView4 = inflate.findViewById(R.id.text_dash4);
        TextView textView5 = inflate.findViewById(R.id.text_dash5);
        TextView textView6 = inflate.findViewById(R.id.text_dash6);
        TextView textView7 = inflate.findViewById(R.id.text_dash7);
        TextView textView8 = inflate.findViewById(R.id.text_dash8);
        TextView textView9 = inflate.findViewById(R.id.text_dash9);
        TextView textView10 = inflate.findViewById(R.id.text_dash10);
        TextView textView11 = inflate.findViewById(R.id.text_dash11);
        TextView textView12 = inflate.findViewById(R.id.text_dash12);
        TextView textView13 = inflate.findViewById(R.id.text_dash13);
        TextView textView14 = inflate.findViewById(R.id.text_dash14);


        //点击事件
        btn_pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.a);
                imageView1.setImageResource(R.drawable.a1);
                imageView2.setImageResource(R.drawable.a2);
                imageView3.setImageResource(R.drawable.a3);
                imageView4.setImageResource(R.drawable.a4);
                imageView5.setImageResource(R.drawable.a5);
                imageView6.setImageResource(R.drawable.a6);
                imageView7.setImageResource(R.drawable.a7);
                imageView8.setImageResource(R.drawable.a8);
                imageView9.setImageResource(R.drawable.a9);
                imageView10.setImageResource(R.drawable.a10);
                imageView11.setImageResource(R.drawable.a11);
                imageView12.setImageResource(R.drawable.a12);
                imageView13.setImageResource(R.drawable.a13);


                textView.setText(R.string.pr1);
                textView1.setText(R.string.pr2);
                textView2.setText(R.string.pr3);
                textView3.setText(R.string.pr4);
                textView4.setText(R.string.pr5);
                textView5.setText(R.string.pr6);
                textView6.setText(R.string.pr7);
                textView7.setText(R.string.pr8);
                textView8.setText(R.string.pr9);
                textView9.setText(R.string.pr10);
                textView10.setText(R.string.pr11);
                textView11.setText(R.string.pr12);
                textView12.setText(R.string.pr13);
                textView13.setText(R.string.pr14);
                textView14.setText(R.string.pr15);


                textView.setTypeface(Typeface.MONOSPACE);
                textView1.setTypeface(Typeface.MONOSPACE);
                textView2.setTypeface(Typeface.MONOSPACE);
                textView3.setTypeface(Typeface.MONOSPACE);
                textView4.setTypeface(Typeface.MONOSPACE);
                textView5.setTypeface(Typeface.MONOSPACE);
                textView6.setTypeface(Typeface.MONOSPACE);
                textView7.setTypeface(Typeface.MONOSPACE);
                textView8.setTypeface(Typeface.MONOSPACE);
                textView9.setTypeface(Typeface.MONOSPACE);
                textView10.setTypeface(Typeface.MONOSPACE);
                textView11.setTypeface(Typeface.MONOSPACE);
                textView12.setTypeface(Typeface.MONOSPACE);
                textView13.setTypeface(Typeface.MONOSPACE);
                textView14.setTypeface(Typeface.MONOSPACE);

            }
        });

        btn_kid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.k1);
                imageView1.setImageResource(R.drawable.k2);
                imageView2.setImageResource(R.drawable.k3);
                imageView3.setImageResource(R.drawable.k4);
                imageView4.setImageResource(R.drawable.k5);
                imageView5.setImageResource(R.drawable.k6);
                imageView6.setImageResource(R.drawable.k7);
                imageView7.setImageResource(R.drawable.k8);
                imageView8.setImageResource(R.drawable.k9);
                imageView9.setImageResource(R.drawable.k10);
                imageView10.setImageResource(R.drawable.k11);
                imageView11.setImageResource(R.drawable.k12);
                imageView12.setImageResource(R.drawable.k13);


                textView.setText(R.string.kid1);
                textView1.setText(R.string.kid2);
                textView2.setText(R.string.kid3);
                textView3.setText(R.string.kid4);
                textView4.setText(R.string.kid5);
                textView5.setText(R.string.kid6);
                textView6.setText(R.string.kid7);
                textView7.setText(R.string.kid8);
                textView8.setText(R.string.kid9);
                textView9.setText(R.string.kid10);
                textView10.setText(R.string.kid11);
                textView11.setText(R.string.kid12);
                textView12.setText(R.string.kid13);
                textView13.setText(R.string.kid14);


                textView.setTypeface(Typeface.MONOSPACE);
                textView1.setTypeface(Typeface.MONOSPACE);
                textView2.setTypeface(Typeface.MONOSPACE);
                textView3.setTypeface(Typeface.MONOSPACE);
                textView4.setTypeface(Typeface.MONOSPACE);
                textView5.setTypeface(Typeface.MONOSPACE);
                textView6.setTypeface(Typeface.MONOSPACE);
                textView7.setTypeface(Typeface.MONOSPACE);
                textView8.setTypeface(Typeface.MONOSPACE);
                textView9.setTypeface(Typeface.MONOSPACE);
                textView10.setTypeface(Typeface.MONOSPACE);
                textView11.setTypeface(Typeface.MONOSPACE);
                textView12.setTypeface(Typeface.MONOSPACE);
                textView13.setTypeface(Typeface.MONOSPACE);

            }
        });

        btn_old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(0);
                imageView1.setImageResource(0);
                imageView2.setImageResource(0);
                imageView3.setImageResource(0);
                imageView4.setImageResource(0);
                imageView5.setImageResource(0);
                imageView6.setImageResource(0);
                imageView7.setImageResource(0);
                imageView8.setImageResource(0);
                imageView9.setImageResource(0);
                imageView10.setImageResource(0);
                imageView11.setImageResource(0);
                imageView12.setImageResource(0);

                textView1.setText("");
                textView2.setText("");
                textView3.setText("");
                textView4.setText("");
                textView5.setText("");
                textView6.setText("");
                textView7.setText("");
                textView8.setText("");
                textView9.setText("");
                textView10.setText("");
                textView11.setText("");
                textView12.setText("");
                textView13.setText("");

                textView.setText(R.string.old1);

                textView.setTypeface(Typeface.MONOSPACE);
            }
        });
        return inflate;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}