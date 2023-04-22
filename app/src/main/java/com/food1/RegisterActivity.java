package com.food1;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RegisterActivity extends AppCompatActivity {
    private EditText edt_username;
    private EditText edt_password;
    private EditText edt_repass;
    private EditText edt_address;
    private EditText edt_phone;
    private Button btn_register;
    private Button btn_exit;
    public String url = "http://192.168.1.9:8080/food/register";

    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);
        //透明状态栏          
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        edt_username = findViewById(R.id.register_username);
        edt_password = findViewById(R.id.register_password);
        edt_repass = findViewById(R.id.register_repass);
        edt_address = findViewById(R.id.register_address);
        edt_phone = findViewById(R.id.register_phone);
        btn_register = findViewById(R.id.btn_register_register);
        btn_exit = findViewById(R.id.btn_register_exit);

        //网络权限语句，4.0版本以上的网络请求无法在主线程中完成，此语句旨在避开该条件
        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edt_username.getText().toString();
                String password = edt_password.getText().toString();
                String repass = edt_repass.getText().toString();
                String address = edt_address.getText().toString();
                String phone = edt_phone.getText().toString();
                if (username!=null&&password!=null&&address!=null&&phone!=null&&password.equals(repass)){
                    String data = "username="+username+"&password="+password+"&address="+address+"&phone="+phone;
                    try {
                        //String msg = register(url,data);
                        String msg = register(username,password,address,phone,data);
                        if (msg.equals("ok")){
                            //简单的带参数
                            Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                            Toast.makeText(RegisterActivity.this, "注册成功！欢迎"+username, Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }else{
                            //显示Intent跳转Activity
                            Intent intent = new Intent(RegisterActivity.this,RegisterActivity.class);
                            Toast.makeText(RegisterActivity.this, "注册失败，请检查", Toast.LENGTH_LONG).show();
                            startActivity(intent);
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }



            }
        });

    }
    private String register(String username, String password, String address, String phone, String data) throws IOException {
        String result = null;
        OkHttpClient httpClient=new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("username", username)
                .add("password", password)
                .add("address", address)
                .add("phone", phone)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            result = response.body().string();
            System.out.println(result);
        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }
}
