package com.food1.ui.Mine;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.alibaba.fastjson2.JSON;
import com.food1.LoginActivity;
import com.food1.MainActivity;
import com.food1.R;
import com.food1.RegisterActivity;
import com.food1.bean.infoBean;
import com.food1.bean.user_info;
import com.food1.bean.user_login_bean;
import com.food1.databinding.FragmentMineBinding;
import com.food1.ui.Mine.MineViewModel;
import com.food1.ui.dashboard.DashboardFragment;
import com.food1.ui.home.HomeFragment;
import com.food1.ui.notifications.NotificationsFragment;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MineFragment extends Fragment {

    private FragmentMineBinding binding;
    String url_heal = "http://192.168.1.9:8080/food/check";
    String url_info = "http://192.168.1.9:8080/food/check_info";
    String url_bad = "http://192.168.1.9:8080/food/bad";
    String url_better = "http://192.168.1.9:8080/food/better";



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_mine, container, false);
        //文字栏
        TextView text_mine = inflate.findViewById(R.id.text_mine);
        TextView text_mine1 = inflate.findViewById(R.id.text_mine1);
        TextView text_mine2 = inflate.findViewById(R.id.text_mine2);
        TextView text_mine3 = inflate.findViewById(R.id.text_mine3);
        Button btn_bad = inflate.findViewById(R.id.btn_bad);
        Button btn_better = inflate.findViewById(R.id.btn_better);

        Intent intent = getActivity().getIntent();
        String user = intent.getStringExtra("user");
        //String msg = intent.getStringExtra("msg");
        String msg = null;
        String info_msg = null;
        try {
            msg = check(user);
            info_msg = check_info(user);

            user_login_bean user_heal = JSON.parseObject(msg, user_login_bean.class);
            user_info user_info = JSON.parseObject(info_msg, user_info.class);

            String a = null;
            String b = null;

            if (user_heal.getHeal()==0){
                a="未感染";
            }else{
                a="已感染";
            }

            switch (user_heal.getPeriod()){
                case 0:
                    b="感染初期";
                    break;
                case 1:
                    b="感染中期";
                    break;
                case 2:
                    b="感染后期";
                    break;
                case 3:
                    b="感染恢复期";
                    break;
                case -1:
                    b="健康";
            }

            text_mine.setText(user_heal.getUsername());
            text_mine1.setText("电话："+user_info.getPhone());
            text_mine2.setText("地址："+user_info.getAddress());
            text_mine3.setText("您目前："+ a +"  属于："+ b);




            text_mine.setTypeface(Typeface.MONOSPACE);
            text_mine1.setTypeface(Typeface.MONOSPACE);
            text_mine2.setTypeface(Typeface.MONOSPACE);
            text_mine3.setTypeface(Typeface.MONOSPACE);

            btn_bad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (user_heal.getPeriod()<2){
                        try {
                            bad(user_heal.getUsername());
                            Toast.makeText(getActivity(), "更新成功！", Toast.LENGTH_LONG).show();
                        } catch (IOException e) {
                            Toast.makeText(getActivity(), "更新失败！", Toast.LENGTH_LONG).show();
                            throw new RuntimeException(e);

                        }
                    }else{
                        Toast.makeText(getActivity(), "已经最差了！", Toast.LENGTH_LONG).show();
                    }

                }
            });

            btn_better.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (user_heal.getPeriod()<3&&user_heal.getPeriod()!=-1){
                        try {
                            bad(user_heal.getUsername());


                            Toast.makeText(getActivity(), "更新成功！", Toast.LENGTH_LONG).show();
                        } catch (IOException e) {
                            Toast.makeText(getActivity(), "更新失败！", Toast.LENGTH_LONG).show();
                            throw new RuntimeException(e);

                        }
                    } else if (user_heal.getPeriod()==3) {
                        try {
                            better(user_heal.getUsername());
                            Toast.makeText(getActivity(), "更新成功！", Toast.LENGTH_LONG).show();

                        } catch (IOException e) {
                            Toast.makeText(getActivity(), "更新失败！", Toast.LENGTH_LONG).show();
                            throw new RuntimeException(e);
                        }
                    }else
                    {
                        Toast.makeText(getActivity(), "已经最好了！", Toast.LENGTH_LONG).show();
                    }


                }
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return inflate;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public String check(String username) throws IOException {
        String result = null;
        OkHttpClient httpClient = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("username", username)
                .build();
        Request request = new Request.Builder()
                .url(url_heal)
                .post(requestBody)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            result = response.body().string();
            //System.out.println(result);
            return result;
        } catch (IOException e) {
            return "error";
        }

    }

    public String check_info(String username) throws IOException {
        String result = null;
        OkHttpClient httpClient = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("username", username)
                .build();
        Request request = new Request.Builder()
                .url(url_info)
                .post(requestBody)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            result = response.body().string();
            //System.out.println(result);
            return result;
        } catch (IOException e) {
            return "error";
        }

    }

    public void bad(String username) throws IOException {
        String result = null;
        OkHttpClient httpClient = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("username", username)
                .build();
        Request request = new Request.Builder()
                .url(url_bad)
                .post(requestBody)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            //result = response.body().string();
            //System.out.println(result);
        } catch (IOException e) {
        }
    }

    public void better(String username) throws IOException {
        String result = null;
        OkHttpClient httpClient = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("username", username)
                .build();
        Request request = new Request.Builder()
                .url(url_better)
                .post(requestBody)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            //result = response.body().string();
            //System.out.println(result);
        } catch (IOException e) {
        }
    }
}