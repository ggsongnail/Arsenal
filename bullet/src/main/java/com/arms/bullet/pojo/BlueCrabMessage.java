package com.arms.bullet.pojo;

import java.io.Serializable;

public class BlueCrabMessage implements Serializable {
    /*{"channel":"A00001","code":"AK48","env":"WIFI","key":"yanglaoban","mobile":"15816038308","os":"IOS","signature":"d4e5b95d125e4308b77aa1080949b902","timestamp":1548062491}*/

    private String channel;
    private String code;
    private String env;
    private String mobile;
    private String os;
    private String signature;
    private Long timestamp;


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
