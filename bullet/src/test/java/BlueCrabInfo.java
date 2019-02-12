import java.util.List;

public class BlueCrabInfo {
    private String secretKey;
    private String callbackUrl;
    private List<String> validIps;

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public List<String> getValidIps() {
        return validIps;
    }

    public void setValidIps(List<String> validIps) {
        this.validIps = validIps;
    }
}
