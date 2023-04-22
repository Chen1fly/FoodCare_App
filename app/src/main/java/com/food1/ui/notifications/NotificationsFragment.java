package com.food1.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.food1.R;
import com.food1.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_notifications, container, false);

        ImageView imageView1 = inflate.findViewById(R.id.noti_pic1);
        ImageView imageView2 = inflate.findViewById(R.id.noti_pic2);
        ImageView imageView3 = inflate.findViewById(R.id.noti_pic3);
        ImageView imageView4 = inflate.findViewById(R.id.noti_pic4);
        ImageView imageView5 = inflate.findViewById(R.id.noti_pic5);
        ImageView imageView6 = inflate.findViewById(R.id.noti_pic6);
        ImageView imageView7 = inflate.findViewById(R.id.noti_pic7);
        ImageView imageView8 = inflate.findViewById(R.id.noti_pic8);
        ImageView imageView9 = inflate.findViewById(R.id.noti_pic9);
        ImageView imageView10 = inflate.findViewById(R.id.noti_pic10);
        ImageView imageView11 = inflate.findViewById(R.id.noti_pic11);
        ImageView imageView12 = inflate.findViewById(R.id.noti_pic12);
        ImageView imageView13 = inflate.findViewById(R.id.noti_pic13);

        TextView textView = inflate.findViewById(R.id.text_noti);
        TextView textView1 = inflate.findViewById(R.id.text_noti1);
        TextView textView2 = inflate.findViewById(R.id.text_noti2);
        TextView textView3 = inflate.findViewById(R.id.text_noti3);
        TextView textView4 = inflate.findViewById(R.id.text_noti4);
        TextView textView5 = inflate.findViewById(R.id.text_noti5);
        TextView textView6 = inflate.findViewById(R.id.text_noti6);
        TextView textView7 = inflate.findViewById(R.id.text_noti7);
        TextView textView8 = inflate.findViewById(R.id.text_noti8);

        imageView1.setImageResource(R.drawable.n1);
        imageView2.setImageResource(R.drawable.n2);
        imageView3.setImageResource(R.drawable.n3);
        imageView4.setImageResource(R.drawable.n4);
        imageView5.setImageResource(R.drawable.n5);
        imageView6.setImageResource(R.drawable.n6);
        imageView7.setImageResource(R.drawable.n7);
        imageView8.setImageResource(R.drawable.n8);
        imageView9.setImageResource(R.drawable.n9);
        imageView10.setImageResource(R.drawable.n10);
        imageView11.setImageResource(R.drawable.n11);
        imageView12.setImageResource(R.drawable.n12);
        imageView13.setImageResource(R.drawable.n13);

        textView.setText(R.string.n1);
        textView1.setText(R.string.n2);
        textView2.setText(R.string.n3);
        textView3.setText(R.string.n4);
        textView4.setText(R.string.n5);
        textView5.setText(R.string.n6);
        textView6.setText(R.string.n7);
        textView7.setText(R.string.n8);
        textView8.setText(R.string.n9);

        return inflate;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}