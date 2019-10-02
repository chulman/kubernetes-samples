package com.chulman.k8s.sample;

import java.net.InetAddress;

public class Host {
    private String name;
    private String ip;

    public Host() {
        try {
            this.name = InetAddress.getLocalHost().getHostName();
            this.ip = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception ex) {
            this.name = "";
            this.ip = "";
        }
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return this.ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
}