import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class HttpClientShootTest {
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
}
