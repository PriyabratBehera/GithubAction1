package com.qa.utils;

public class GlobalParams {

    private static ThreadLocal<String> platformName = new ThreadLocal<String>();
    private static ThreadLocal<String> udid = new ThreadLocal<String>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private static ThreadLocal<String> systemPort = new ThreadLocal<String>();
    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>();
    private static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
    private static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>();

    private static ThreadLocal<String> mobileNumber = new ThreadLocal<String>();
    private static ThreadLocal<String> randomNumber = new ThreadLocal<String>();

    private static ThreadLocal<String> browserType = new ThreadLocal<String>();

    private static ThreadLocal<String> environmentType = new ThreadLocal<>();

    public String getRandomNumber() {
        return randomNumber.get();
    }

    public void setRandomNumber(String randomNumber1) {
        randomNumber.set(randomNumber1);
    }

    public String getEnvironment() {
        return environmentType.get();
    }

    public void setEnvironment(String environment) {
        environmentType.set(environment);
    }

    public String getMobileNumber() {
        return mobileNumber.get();
    }

    public void setMobileNumber(String mobileNumber1) {
        mobileNumber.set(mobileNumber1);
    }

    public String getPlatformName() {
        return platformName.get();
    }

    public void setPlatformName(String platformName1) {
        platformName.set(platformName1);
    }

    public String getUDID() {
        return udid.get();
    }

    public void setUDID(String udid2) {
        udid.set(udid2);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }

    public String getSystemPort() {
        return systemPort.get();
    }

    public void setSystemPort(String systemPort2) {
        systemPort.set(systemPort2);
    }

    public String getChromeDriverPort() {
        return chromeDriverPort.get();
    }

    public void setChromeDriverPort(String chromeDriverPort2) {
        chromeDriverPort.set(chromeDriverPort2);
    }

    public String getWdaLocalPort() {
        return wdaLocalPort.get();
    }

    public void setWdaLocalPort(String wdaLocalPort2) {
        wdaLocalPort.set(wdaLocalPort2);
    }

    public String getWebkitDebugProxyPort() {
        return webkitDebugProxyPort.get();
    }

    public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
        webkitDebugProxyPort.set(webkitDebugProxyPort2);
    }

    public String getBrowserType() {
        return browserType.get();
    }

    public void setBrowserType(String browserType1) {
        browserType.set(browserType1);
    }

    public void initializeGlobalParams() {
        GlobalParams params = new GlobalParams();
        params.setPlatformName(System.getProperty("platformName", "iOS"));
        params.setUDID(System.getProperty("udid", "4801479C-4B65-4C82-B117-017F9A013E72"));
        params.setDeviceName(System.getProperty("deviceName", "iPhone 13"));

        switch (params.getPlatformName()) {
            case "Android":
                params.setSystemPort(System.getProperty("systemPort", "10000"));
                params.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
                break;
            case "iOS":
                params.setWdaLocalPort(System.getProperty("wdaLocalPort", "10001"));
                params.setWebkitDebugProxyPort(System.getProperty("webkitDebugProxyPort", "11001"));
                break;
            default:
                throw new IllegalStateException("Invalid Platform Name!");
        }
    }
}
