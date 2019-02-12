import com.alibaba.fastjson.JSONObject;
import com.arms.bullet.pojo.BlueCrabMessage;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.security.MD5Encoder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HttpClientShootTest {
    public static final String SECRET_KEY = "ylbqx";
    public static final String TEST_URL = "https://m.ibaboss.com/app/user/blue/crab/msg/receive";
    public static final String LOCAL_URL = "http://localhost:8081/app/user/blue/crab/msg/receive";
    CloseableHttpClient closeableHttpClient;
    @Before
    public void init(){
        closeableHttpClient = HttpClients.createDefault();
    }
    @Test
    public void test() throws IOException {
        HttpGet httpGet = new HttpGet("http://localhost:8080/user/json/1");
        String response = closeableHttpClient.execute(httpGet,new BasicResponseHandler());
        System.out.println(response);
    }

    @Test
    public void sengMsgToIba() throws Exception {
        BlueCrabMessage blueCrabMessage = getBlueCrabMessage("13076761307","KFCBB");
        HttpPost httpPost = new HttpPost(LOCAL_URL);
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("reqData", JSONObject.toJSONString(blueCrabMessage)));
        httpPost.setEntity(new UrlEncodedFormEntity(nvps));
        CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
        System.out.println(EntityUtils.toString(response.getEntity()));
        response.close();
    }

    private BlueCrabMessage getBlueCrabMessage(String moblie,String code) {
        BlueCrabMessage blueCrabMessage = new BlueCrabMessage();
        blueCrabMessage.setChannel("A00001");
        blueCrabMessage.setCode(code);
        blueCrabMessage.setEnv("WIFI");
        blueCrabMessage.setMobile(moblie);
        blueCrabMessage.setOs("IOS");
        blueCrabMessage.setSignature(getMD5(String.format("%s%s%s",blueCrabMessage.getMobile(),blueCrabMessage.getCode(),SECRET_KEY)));
        blueCrabMessage.setTimestamp(1548381381l);
        return blueCrabMessage;
    }

    public static String getMD5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            String md5=new BigInteger(1, md.digest()).toString(16);
            return fillMD5(md5);
        } catch (Exception e) {
            throw new RuntimeException("MD5加密错误:"+e.getMessage(),e);
        }
    }

    public static String fillMD5(String md5){
        return md5.length()==32?md5:fillMD5("0"+md5);
    }

    @Test
    public void testCallback() throws Exception {
        String url = "http://www.shouzhiji.cn/test/public/index.php/index/jd/downloadCallback";
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json");
        httpPost.setEntity(new StringEntity("{\"channel\":\"A00001\",\"code\":\"AK48\",\"env\":\"WIFI\",\"key\":\"yanglaoban\",\"mobile\":\"15816038308\",\"os\":\"IOS\",\"signature\":\"d4e5b95d125e4308b77aa1080949b902\",\"timestamp\":1548062491,\"aa\":0}"));
        CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
        System.out.println(EntityUtils.toString(response.getEntity()));
        response.close();
    }

    public static void main(String[] args) {
        System.out.println(new Date().getTime());
    }

}
