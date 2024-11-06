package com.qa.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.util.HashMap;

public class ServerManager {
    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AppiumDriverLocalService getServer() {
        return server.get();
    }

    public void startServer() {
        utils.log().info("starting appium server");
        AppiumDriverLocalService server = WindowsGetAppiumService();
        server.start();
        if (server == null || !server.isRunning()) {
            utils.log().fatal("Appium server not started. ABORT!!!");
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!");
        }
        server.clearOutPutStreams();
        this.server.set(server);
        utils.log().info("Appium server started");
        //        if (Objects.equals(new GlobalParams().getPlatformName(), "iOS")) {
//            new DeviceManager().waitForWebDriverAgentLunch();
//        }
    }

    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }

    public AppiumDriverLocalService WindowsGetAppiumService() {
        GlobalParams params = new GlobalParams();
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//                .usingDriverExecutable(new File("/usr/local/bin/node"))
//                .withAppiumJS(
//                        new File("/Users/litan/node_modules/appium/build/lib/main.js"))
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(() -> "-pa", "/wd/hub")
//                .withArgument(() -> "--use-plugins", "element-wait")
                .withLogFile(new File(params.getPlatformName() + "_"
                        + params.getDeviceName() + File.separator + "Server.log")));
    }

    public AppiumDriverLocalService MacGetAppiumService() {
        GlobalParams params = new GlobalParams();
        HashMap<String, String> environment = new HashMap<String, String>();
        environment.put("PATH", "/Library/Java/JavaVirtualMachines/jdk-15.0.2.jdk/Contents/Home/bin:/Users/litan/Library/Android/sdk/tools:/Users/litan/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin" + System.getenv("PATH"));
        environment.put("ANDROID_HOME", "/Users/litan/Library/Android/sdk");
        environment.put("JAVA_HOME", "/Library/Java/JavaVirtualMachines/jdk-15.0.2.jdk/Contents/Home");
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("/opt/homebrew/bin/node"))
                .withAppiumJS(new File("/opt/homebrew/lib/node_modules/appium/build/lib/main.js"))
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withEnvironment(environment)
                .withLogFile(new File(params.getPlatformName() + "_"
                        + params.getDeviceName() + File.separator + "Server.log")));
    }
}
