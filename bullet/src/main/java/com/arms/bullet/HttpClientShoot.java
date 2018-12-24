package com.arms.bullet;

import com.arms.ak47.pojo.User;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpClientShoot {
    public static void main(String[] args) throws IOException {
        User user = new User();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/user/json/1");
        String response = httpClient.execute(httpGet,new BasicResponseHandler());
        System.out.println(response);
    }
}
