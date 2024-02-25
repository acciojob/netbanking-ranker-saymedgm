package com.driver;

public class NetBankingApp {
    private String appName;
    private int securityRating;  // out of 10
    private int userFriendliness; // out of 10
    private int numOfFeatures;

    public NetBankingApp(String appName, int securityRating, int userFriendliness, int numOfFeatures) {
        this.appName = appName;
        this.securityRating = securityRating;
        this.userFriendliness = userFriendliness;
        this.numOfFeatures = numOfFeatures;
    }

    public String getAppName() {
        return appName;
    }

    public int getSecurityRating() {
        return securityRating;
    }

    public int getUserFriendliness() {
        return userFriendliness;
    }

    public int getNumOfFeatures() {
        return numOfFeatures;
    }
}