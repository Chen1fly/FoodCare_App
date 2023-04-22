package com.food1.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 利用okhttp进行get和post的访问
 *
 * @author cp
 *
 */
public class OkHttpUtil {

    public final static String TAG = "OkHttpUtil";
    public final static int CONNECT_TIMEOUT = 60;
    public final static int READ_TIMEOUT = 100;
    public final static int WRITE_TIMEOUT = 60;
    // 后台数据接口基础路径
    public final static String BASE_URL="http://192.168.64.1:8010";
    public static final OkHttpClient client = new OkHttpClient.Builder()
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)// 设置读取超时时间
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)// 设置写的超时时间
            .connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS)// 设置连接超时时间
            .build();
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    //post请求，携带参数
    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }
    //get请求。不带参数
    public static String get(String url) throws IOException{
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
        Response response = null;
        //同步请求返回的是response对象
        response = client.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        } else {
            throw new IOException("Unexpected code " + response);
        }
    }
}
