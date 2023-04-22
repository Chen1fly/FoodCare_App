package com.food1.ui.home;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.fastjson2.JSON;
import com.food1.R;
import com.food1.bean.infoBean;
import com.food1.bean.user_login_bean;
import com.food1.ui.dashboard.DashboardFragment;
import com.food1.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HomeFragment extends Fragment {

    private final ArrayList<infoBean> banners;
    String url_heal = "http://192.168.1.9:8080/food/check";
    public HomeFragment() {
        //v1,v2这些是轮播图片，可用自己本地的替换掉。
        banners = new ArrayList<>();
        banners.add(new infoBean(R.drawable.banner1));
        banners.add(new infoBean(R.drawable.banner2));
        banners.add(new infoBean(R.drawable.banner3));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_home, container, false);
        //文字栏
        TextView textView = inflate.findViewById(R.id.text_home);
        //pic栏
        ImageView imageView = inflate.findViewById(R.id.home_pic);
        ImageView imageView1 = inflate.findViewById(R.id.home_pic1);
        ImageView imageView2 = inflate.findViewById(R.id.home_pic2);
        ImageView imageView3 = inflate.findViewById(R.id.home_pic3);
        ImageView imageView4 = inflate.findViewById(R.id.home_pic4);
        ImageView imageView5 = inflate.findViewById(R.id.home_pic5);
        ImageView imageView6 = inflate.findViewById(R.id.home_pic6);
        ImageView imageView7 = inflate.findViewById(R.id.home_pic7);
        ImageView imageView8 = inflate.findViewById(R.id.home_pic8);
        ImageView imageView9 = inflate.findViewById(R.id.home_pic9);
        ImageView imageView10 = inflate.findViewById(R.id.home_pic10);
        ImageView imageView11 = inflate.findViewById(R.id.home_pic11);
        ImageView imageView12 = inflate.findViewById(R.id.home_pic12);
        ImageView imageView13 = inflate.findViewById(R.id.home_pic13);
        ImageView imageView14 = inflate.findViewById(R.id.home_pic14);
        ImageView imageView15 = inflate.findViewById(R.id.home_pic15);
        ImageView imageView16 = inflate.findViewById(R.id.home_pic16);
        ImageView imageView17 = inflate.findViewById(R.id.home_pic17);
        ImageView imageView18 = inflate.findViewById(R.id.home_pic18);
        ImageView imageView19 = inflate.findViewById(R.id.home_pic19);


        Banner banner = inflate.findViewById(R.id.banner);
        //添加生命周期
        banner.addBannerLifecycleObserver(this)
                .setAdapter(new BannerViewAdapter(banners, this))
                //添加指示器
                .setIndicator(new CircleIndicator(getContext()));
        banner.setOnBannerListener(new OnBannerListener<infoBean>() {
            @Override
            public void OnBannerClick(infoBean data, int position) {
                System.out.println(position);
                if (position==0){
                //点第一个就啥也不干
                } else if (position==1) {
                    FragmentManager fragmentManager1 = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    //跳转到其他fragment
                    fragmentTransaction1.replace(R.id.fragment_container0, new DashboardFragment());
                    fragmentTransaction1.addToBackStack(null);
                    fragmentTransaction1.commit();
                    updateNavigationBar(R.id.navigation_dashboard);
                } else if (position==2) {
                    FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                    //跳转到其他fragment
                    fragmentTransaction2.replace(R.id.fragment_container0, new NotificationsFragment());
                    fragmentTransaction2.addToBackStack(null);
                    fragmentTransaction2.commit();
                    updateNavigationBar(R.id.navigation_notifications);
                }
            }
        });

        //根据传来的值显示一些东西
        Intent intent = getActivity().getIntent();
        String user = intent.getStringExtra("user");
        try {
            String info = check(user);
            //super.onResume();
            System.out.println(info);
            user_login_bean user_heal = JSON.parseObject(info, user_login_bean.class);
            if (user_heal.getHeal()==1){
                switch (user_heal.getPeriod()){
                    case 0:
                        imageView.setImageResource(R.drawable.p1);
                        imageView1.setImageResource(R.drawable.p2);
                        imageView2.setImageResource(R.drawable.p3);
                        imageView3.setImageResource(R.drawable.p4);
                        imageView4.setImageResource(R.drawable.p5);
                        imageView5.setImageResource(R.drawable.p6);
                        imageView6.setImageResource(R.drawable.p7);
                        imageView7.setImageResource(R.drawable.p8);
                        imageView8.setImageResource(R.drawable.p9);
                        imageView9.setImageResource(R.drawable.p10);
                        imageView10.setImageResource(R.drawable.p11);
                        imageView11.setImageResource(R.drawable.p12);
                        imageView12.setImageResource(R.drawable.p13);
                        imageView13.setImageResource(R.drawable.p14);
                        imageView14.setImageResource(R.drawable.p15);
                        imageView15.setImageResource(R.drawable.p16);
                        imageView16.setImageResource(R.drawable.p17);
                        imageView17.setImageResource(R.drawable.p18);
                        imageView18.setImageResource(R.drawable.p19);

                        textView.setText(R.string.period1);
                        textView.setTypeface(Typeface.MONOSPACE);
                        break;

                    case 1:
                        imageView.setImageResource(R.drawable.s1);
                        imageView1.setImageResource(R.drawable.s2);
                        imageView2.setImageResource(R.drawable.s3);
                        imageView3.setImageResource(R.drawable.s4);
                        imageView4.setImageResource(R.drawable.s5);
                        imageView5.setImageResource(R.drawable.s6);
                        imageView6.setImageResource(R.drawable.s7);
                        imageView7.setImageResource(R.drawable.s8);
                        imageView8.setImageResource(R.drawable.s9);
                        imageView9.setImageResource(R.drawable.s10);
                        imageView10.setImageResource(R.drawable.s11);
                        imageView11.setImageResource(R.drawable.s12);

                        textView.setText(R.string.period2);
                        textView.setTypeface(Typeface.MONOSPACE);
                        break;

                    case 2:
                        imageView.setImageResource(R.drawable.h1);
                        imageView1.setImageResource(R.drawable.h2);
                        imageView2.setImageResource(R.drawable.h3);
                        imageView3.setImageResource(R.drawable.h4);
                        imageView4.setImageResource(R.drawable.h5);
                        imageView5.setImageResource(R.drawable.h6);
                        imageView6.setImageResource(R.drawable.h7);
                        imageView7.setImageResource(R.drawable.h8);
                        imageView8.setImageResource(R.drawable.h9);
                        imageView9.setImageResource(R.drawable.h10);
                        imageView10.setImageResource(R.drawable.h11);

                        textView.setText(R.string.period3);
                        textView.setTypeface(Typeface.MONOSPACE);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.z1);
                        imageView1.setImageResource(R.drawable.z2);
                        imageView2.setImageResource(R.drawable.z3);
                        imageView3.setImageResource(R.drawable.z4);
                        imageView4.setImageResource(R.drawable.z5);
                        imageView5.setImageResource(R.drawable.z6);
                        imageView6.setImageResource(R.drawable.z7);
                        imageView7.setImageResource(R.drawable.z8);
                        imageView8.setImageResource(R.drawable.z9);
                        imageView9.setImageResource(R.drawable.z10);
                        imageView10.setImageResource(R.drawable.z11);
                        imageView11.setImageResource(R.drawable.z12);
                        imageView12.setImageResource(R.drawable.z13);
                        imageView13.setImageResource(R.drawable.z14);
                        imageView14.setImageResource(R.drawable.z15);
                        imageView15.setImageResource(R.drawable.z16);

                        textView.setText(R.string.period4);
                        textView.setTypeface(Typeface.MONOSPACE);
                        break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return inflate;



    }

    // 在 Fragment 切换时调用该方法来更新底部 Navigation 的选中项
    private void updateNavigationBar(int itemId) {
        BottomNavigationView navigationView = getActivity().findViewById(R.id.nav_view);
        navigationView.setSelectedItemId(itemId);
    }

    public class BannerViewAdapter extends BannerAdapter<infoBean, BannerViewAdapter.BannerViewHodler> {
        private Fragment fragment;

        public BannerViewAdapter(List<infoBean> banners, Fragment fragment) {
            super(banners);
            this.fragment = fragment;
        }

        @Override
        public BannerViewAdapter.BannerViewHodler onCreateHolder(ViewGroup parent, int viewType) {
            ImageView imageView = new ImageView(parent.getContext());
            imageView.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            ));
            //setScaleType对图片进行大小处理 CENTER_CROP对原图居中显示后进行等比放缩处理，使最小边等于ImageView的相应边
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return new BannerViewHodler(imageView);

        }
        //用于绑定图片资源文件
        @Override
        public void onBindView(BannerViewAdapter.BannerViewHodler holder, infoBean data, int position, int size) {
            holder.imageView.setImageResource(data.picture);
        }
        //ViewHolder主要用于容纳view视图
        public class BannerViewHodler extends RecyclerView.ViewHolder {
            ImageView imageView;

            public BannerViewHodler(@NonNull ImageView itemView) {
                super(itemView);
                this.imageView = itemView;
            }
        }
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
}