package com.qa.utils;

import io.cucumber.testng.CucumberOptions;

import java.io.*;
import java.util.Objects;
import java.util.Properties;

public class DeviceManager {
    TestUtils utils = new TestUtils();
    GlobalParams globalParams = new GlobalParams();
    private static Properties props = new Properties();

    public void closeSimulator() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("xcrun", "simctl", "shutdown", "all");
//            ProcessBuilder processBuilder = new ProcessBuilder("xcrun", "simctl", "shutdown", "booted");
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                utils.log().info("iOS Simulator closed successfully.");
            } else {
                utils.log().info("Failed to close iOS Simulator.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeEmulator() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("adb", "emu", "kill");
            Process process = processBuilder.start();

            int exitCode = process.waitFor();

            if (exitCode == 0) {
                utils.log().info("Android emulator closed successfully.");
            } else {
                utils.log().info("Failed to close Android emulator.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openEmulator() {
        try {
            String deviceName = globalParams.getDeviceName();
//            String cmd = "emulator -avd " + deviceName;
            String cmd = "emulator -avd " + deviceName + " & adb wait-for-device";
            if (isAppInstalled("com.floatr.personal")) {
                uninstallApp("com.floatr.personal");
                utils.log().info("app uninstall");
            }
            Process process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", cmd});
            process.waitFor();
            utils.log().info("Android Emulator opened successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
        public static void revokeSmsPermission(String packageName) {
            // ADB command to revoke SMS permission
            String command = "adb shell pm revoke " + packageName + " android.permission.RECEIVE_SMS";

            try {
                executeCommand(command);
                System.out.println("SMS permission revoked for package: " + packageName);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        private static void executeCommand(String command) throws IOException, InterruptedException {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            process.waitFor();
        }


    public boolean isAppInstalled(String packageName) {
        try {
            Process process = Runtime.getRuntime().exec("adb shell pm list packages");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(packageName)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void uninstallApp(String packageName) {
        try {
            Process process = Runtime.getRuntime().exec("adb uninstall " + packageName);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cucumberReportingPropertiesUpdater(String moduleName, String testType) throws IOException {
        String filePath = System.getProperty("user.dir") + File.separator + "cucumber-reporting.properties";
        String filePath1 = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "config.properties";

        if (Objects.equals(globalParams.getPlatformName(), "Android") || Objects.equals(globalParams.getPlatformName(), "iOS")) {
            Properties properties = readPropertiesFile(filePath);
            properties.setProperty("classifications.TEST_TYPE", "");
            properties.setProperty("classifications.TEST_TYPE", testType);
            properties.setProperty("classifications.MODULE_NAME", "");
            properties.setProperty("classifications.MODULE_NAME", moduleName);
            writePropertiesFile(properties, filePath);

            Properties properties1 = readPropertiesFile(filePath1);
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                properties1.setProperty("IsAndroidDeviceRunning", "");
                properties1.setProperty("IsAndroidDeviceRunning", "Yes");
                properties1.setProperty("IsIosDeviceRunning", "");
                writePropertiesFile(properties1, filePath1);
            } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
                properties1.setProperty("IsIosDeviceRunning", "");
                properties1.setProperty("IsIosDeviceRunning", "Yes");
                properties1.setProperty("IsAndroidDeviceRunning", "");
                writePropertiesFile(properties1, filePath1);
            }
            if (properties1.getProperty("IsAndroidDeviceRunning").equals("Yes")) {
                properties.setProperty("classifications.DEVICE_TYPE", "");
                properties.setProperty("classifications.DEVICE_TYPE", "Android");
                writePropertiesFile(properties, filePath);
            } else if (properties1.getProperty("IsIosDeviceRunning").equals("Yes")) {
                properties.setProperty("classifications.DEVICE_TYPE", "");
                properties.setProperty("classifications.DEVICE_TYPE", "iOS");
                writePropertiesFile(properties, filePath);
            }
//            if (properties1.getProperty("IsIosDeviceRunning").equals(" ") && properties1.getProperty("IsAndroidDeviceRunning").equals(" ")) {
//                properties.setProperty("classifications.DEVICE_TYPE", "");
//                properties.setProperty("classifications.DEVICE_TYPE", "Both Devices");
//                writePropertiesFile(properties, filePath);
//            }
        }
//        }else if(Objects.equals(globalParams.getPlatformName(),"Web")){
//
//        }
    }

    public void extentPropertiesUpdater() {
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "extent.properties";
        String filePath1 = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "config.properties";

        if (Objects.equals(globalParams.getPlatformName(), "Android") || Objects.equals(globalParams.getPlatformName(), "iOS")) {
            Properties properties = readPropertiesFile(filePath);
            Properties properties1 = readPropertiesFile(filePath1);
            if (Objects.equals(globalParams.getPlatformName(), "Android")) {
                properties1.setProperty("IsAndroidDeviceRunning", "");
                properties1.setProperty("IsAndroidDeviceRunning", "Yes");
                properties1.setProperty("IsIosDeviceRunning", "");
                writePropertiesFile(properties1, filePath1);
            } else if (Objects.equals(globalParams.getPlatformName(), "iOS")) {
                properties1.setProperty("IsIosDeviceRunning", "");
                properties1.setProperty("IsIosDeviceRunning", "Yes");
                properties1.setProperty("IsAndroidDeviceRunning", "");
                writePropertiesFile(properties1, filePath1);
            }
            if (properties1.getProperty("IsAndroidDeviceRunning").equals("Yes")) {
                properties.setProperty("extent.reporter.spark.prefix.device", "");
                properties.setProperty("extent.reporter.spark.prefix.device", "@device_Android");
                properties.setProperty("extent.reporter.pdf.out", "target/Pixel5/PdfReport/ExtentPdf.pdf");
                writePropertiesFile(properties, filePath);
            } else if (properties1.getProperty("IsIosDeviceRunning").equals("Yes")) {
                properties.setProperty("extent.reporter.spark.prefix.device", "");
                properties.setProperty("extent.reporter.spark.prefix.device", "@device_iOS");
                properties.setProperty("extent.reporter.pdf.out", "target/iPhone14ProMax/PdfReport/ExtentPdf.pdf");
                writePropertiesFile(properties, filePath);
            }
//            if (properties1.getProperty("IsIosDeviceRunning").equals(" ") && properties1.getProperty("IsAndroidDeviceRunning").equals(" ")) {
//                properties.setProperty("classifications.DEVICE_TYPE", "");
//                properties.setProperty("classifications.DEVICE_TYPE", "Both Devices");
//                writePropertiesFile(properties, filePath);
//            }
        }
//        }else if(Objects.equals(globalParams.getPlatformName(),"Web")){
//
//        }
    }











    private static Properties readPropertiesFile(String filePath) {
        Properties properties = new Properties();
        try (InputStream inputStream = new FileInputStream(filePath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    private static void writePropertiesFile(Properties properties, String filePath) {
        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
