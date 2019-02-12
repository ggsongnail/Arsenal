import com.alibaba.fastjson.JSONObject;
import org.assertj.core.util.DateUtil;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        System.out.println(Pattern.compile("BLUE-CRAB-ACCOUNT-\\d+").matcher("BLUE-CRAB-ACCOUNT-15816038365").matches());

        //int time1 = 1548301556;
        //String result1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time1 * 1000));
        //System.out.println("10位数的时间戳（秒）--->Date:" + result1);
        long time = System.currentTimeMillis();
        String timeStr = String.format("%010d", time);
        System.out.println(timeStr);
        Date date1 = new Date(timeStr);   //对应的就是时间戳对应的Date
        System.out.println(date1);



        long timestamp = new Date().getTime();
        System.out.println(new Timestamp(timestamp));
    }

    private static void constructBlueMessage() {
        BlueCrabInfo blueCrabInfo = new BlueCrabInfo();
        blueCrabInfo.setCallbackUrl("http://www.shouzhiji.cn/test/public/index.php/index/jd/downloadCallback");
        blueCrabInfo.setSecretKey("ylbqx");
        blueCrabInfo.setValidIps(Arrays.asList("47.105.61.194"));
        System.out.println(JSONObject.toJSONString(blueCrabInfo));
    }
}
