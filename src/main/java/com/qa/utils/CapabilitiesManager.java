package com.qa.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static io.appium.java_client.remote.IOSMobileCapabilityType.USE_PREBUILT_WDA;

public class CapabilitiesManager {
    TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties props = new PropertyManager().getProps();

        try {
            utils.log().info("getting capabilities");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
            caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());

            switch (params.getPlatformName()) {
                case "Android":
                    String androidAppUrl;
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                    caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
                    caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                    caps.setCapability("systemPort", params.getSystemPort());
                    caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
                    caps.setCapability("noReset", true);
                    caps.setCapability("autoAcceptAlerts", true);
//                    caps.setCapability("autoGrantPermissions", true);
//                    caps.setCapability("newCommandTimeout", 300);
                    caps.setCapability("newCommandTimeout", 300);
                    final Map<String, Object> appArgs = new HashMap<>();
                    appArgs.put("appId", "com.floatr.personal");
                    appArgs.put("timeout", 0);
                    if(System.getProperty("PipelineNumber") == null){
                        androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                                + File.separator + "resources" + File.separator + "apps" + File.separator + "app-release-25.apk";
                    }else {
                        androidAppUrl = System.getProperty("user.dir") + File.separator + "pipe-" + System.getProperty("PipelineNumber").trim() + "-app-release.apk";
                    }
                    utils.log().info("appUrl is: " + androidAppUrl);
                    caps.setCapability("app", androidAppUrl);
                    break;
                case "iOS":
                    String iOSAppUrl;
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOSAutomationName"));
                    caps.setCapability(USE_PREBUILT_WDA, true);
//                    caps.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, true);
                    if(System.getProperty("PipelineNumber") == null){
                        iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                                + File.separator + "resources" + File.separator + "apps" + File.separator + "Floatr_25.app";
                    }else {
                        iOSAppUrl = System.getProperty("user.dir") + File.separator + "pipe-" + System.getProperty("PipelineNumber").trim() + "-floatr.app";
                    }
                    utils.log().info("appUrl is: " + iOSAppUrl);
                    caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
                    //caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
                    //caps.setCapability("webkitDebugProxyPort", params.getWebkitDebugProxyPort());
                    caps.setCapability("autoAcceptAlerts", "true");
                    caps.setCapability("app", iOSAppUrl);
                    caps.setCapability("newCommandTimeout", 300);
                    caps.setCapability("noReset", false);
                    caps.setCapability("platformVersion", "16.0");
//                    caps.setCapability("fullReset",true);
//                    caps.setCapability("forceAppLaunch",true);
//                    caps.setCapability("shouldTerminateApp", true);
                    caps.setCapability("maxTypingFrequency", 5);
//                    caps.setCapability("connectHardwareKeyboard", false);
//                    caps.setCapability("unicodeKeyboard", true);
//                    caps.setCapability("resetKeyboard", true);
//                    caps.setCapability("bundleId", props.getProperty("webDriverAgentRunnerBundledId"));
                    break;
            }
            return caps;
        } catch (Exception e) {
            e.printStackTrace();
            utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
            throw e;
        }
    }

    public ChromeOptions getChromeOptions() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        try {
            utils.log().info("getting chrome capabilities");
            caps.setAcceptInsecureCerts(true);
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
            options.setPageLoadStrategy(PageLoadStrategy.EAGER);
            options.addArguments("--start-maximized");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("load-extension"));
            options.addArguments("--incognito");
            options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
            Map<String, Integer> timeouts = new HashMap<String, Integer>();
            timeouts.put("script", 15000);
            options.setCapability("timeouts", timeouts);
            options.merge(caps);
            return options;
        } catch (Exception e) {
            e.printStackTrace();
            utils.log().fatal("Failed to load chrome capabilities. ABORT!!" + e.toString());
            throw e;
        }
    }

    public EdgeOptions getEdgeOptions() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        try {
            utils.log().info("getting edge capabilities");
            caps.setAcceptInsecureCerts(true);
            EdgeOptions options = new EdgeOptions();
            options.setPageLoadStrategy("eager");
            List<String> args = Arrays.asList("--start-maximized", "--disable-notifications", "--inprivate", "enable-automation", "disable-popup-blocking", "load-extension");
            Map<String, Object> map = new HashMap<>();
            map.put("args", args);
            options.setCapability("ms:edgeOptions", map);
            Map<String, Integer> timeouts = new HashMap<String, Integer>();
            timeouts.put("script", 15000);
            options.setCapability("timeouts", timeouts);
            options.merge(caps);
            return options;
        } catch (Exception e) {
            e.printStackTrace();
            utils.log().fatal("Failed to load edge capabilities. ABORT!!" + e.toString());
            throw e;

        }
    }
}

