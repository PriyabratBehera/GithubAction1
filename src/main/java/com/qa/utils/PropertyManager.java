package com.qa.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class PropertyManager {
    private static Properties props = new Properties();
    GlobalParams params = new GlobalParams();
    TestUtils utils = new TestUtils();

    public Properties getProps() throws IOException {
        InputStream is = null;
        String propsFileName = "config.properties";
        String devPropsFile = "dev.config.properties";
        String testPropsFile = "test.config.properties";
        String stagePropsFile = "stage.config.properties";
        if (props.isEmpty()) {
            try {
                utils.log().info("loading config properties");
                if (Objects.equals(params.getPlatformName(), "Android") || Objects.equals(params.getPlatformName(), "iOS")) {
                    is = getClass().getClassLoader().getResourceAsStream(propsFileName);
                    props.load(is);
                } else if (Objects.equals(params.getEnvironment(), "DEV")) {
                    is = getClass().getClassLoader().getResourceAsStream(devPropsFile);
                    props.load(is);
                } else if (Objects.equals(params.getEnvironment(), "TEST")) {
                    is = getClass().getClassLoader().getResourceAsStream(testPropsFile);
                    props.load(is);
                } else if (Objects.equals(params.getEnvironment(), "STAGE")) {
                    is = getClass().getClassLoader().getResourceAsStream(stagePropsFile);
                    props.load(is);
                }
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Failed to load config properties. ABORT!!" + e.toString());
                throw e;
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        }
        return props;
    }

}


