package com.dc.batch.model;

import java.util.Date;

/**
 * Created by Sandeep on 24-05-2015.
 */
public class UsageData {

    private String accountName;
    private Date date;
    private String aggType;

    @Override
    public String toString() {
        return "UsageData{" +
                "accountName='" + accountName + '\'' +
                ", date=" + date +
                ", aggType='" + aggType + '\'' +
                ", instanceId='" + instanceId + '\'' +
                ", instanceName='" + instanceName + '\'' +
                ", ytdLogin=" + ytdLogin +
                ", uniqueLogin=" + uniqueLogin +
                ", totalLogin=" + totalLogin +
                ", allLogin=" + allLogin +
                '}';
    }

    private String instanceId;
    private String instanceName;
    private Double ytdLogin;
    private Double uniqueLogin;
    private Double totalLogin;
    private Double allLogin;


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAggType() {
        return aggType;
    }

    public void setAggType(String aggType) {
        this.aggType = aggType;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Double getYtdLogin() {
        return ytdLogin;
    }

    public void setYtdLogin(Double ytdLogin) {
        this.ytdLogin = ytdLogin;
    }

    public Double getUniqueLogin() {
        return uniqueLogin;
    }

    public void setUniqueLogin(Double uniqueLogin) {
        this.uniqueLogin = uniqueLogin;
    }

    public Double getTotalLogin() {
        return totalLogin;
    }

    public void setTotalLogin(Double totalLogin) {
        this.totalLogin = totalLogin;
    }

    public Double getAllLogin() {
        return allLogin;
    }

    public void setAllLogin(Double allLogin) {
        this.allLogin = allLogin;
    }

}
