import com.arms.bullet.BulletApplication;
import com.arms.bullet.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BulletApplication.class)
public class RestTemplateTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test(){
        User user = restTemplate.getForObject("http://localhost:8080/user/json/1",User.class);
        System.out.println(user.getName());
    }
}
