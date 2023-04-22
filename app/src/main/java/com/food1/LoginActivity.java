package com.food1;

import static com.food1.utils.OkHttpUtil.TAG;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.fastjson2.JSON;
import com.food1.bean.user_login_bean;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity{
    private EditText login_username;
    private EditText login_password;
    private Button btn_login;
    private Button btnRegister;
    private SharedPreferences sharedPreferences;
    public String url = "http://192.168.1.9:8080/food/login";

    public String address = null;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        //透明状态栏          
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        btnRegister = findViewById(R.id.btn_registerActivity);
        login_username = findViewById(R.id.edt_login_username);
        login_password = findViewById(R.id.edt_login_password);
        btn_login = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_registerActivity);
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = login_username.getText().toString();
                String password = login_password.getText().toString();
                //向服务器传参
                //address = url;//+"?username="+username+"&password="+password;
                String data = "username="+username+"&password="+password;
                try {
                    String msg = login(username,password);
                    //返回参数校验msg完成登录
                    if (msg.contains("ok")){
                        //简单的带参数
                        //user_login_bean user_heal = JSON.parseObject(msg, user_login_bean.class);
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        intent.putExtra("user",username);
                        intent.putExtra("msg",msg);
                        Toast.makeText(LoginActivity.this, "登录成功！", Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }else{
                        //显示Intent跳转Activity
                        Intent intent = new Intent(LoginActivity.this,LoginActivity.class);
                        Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }
                } catch (IOException e) {
                    Intent intent = new Intent(LoginActivity.this,LoginActivity.class);
                    Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
    private String login(String username, String password) throws IOException {
        String result = null;
        OkHttpClient httpClient=new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("username", username)
                .add("password", password)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            result = response.body().string();
            //System.out.println(result);
            return result;
        }catch (IOException e){
            return "error";
        }

    }
}




