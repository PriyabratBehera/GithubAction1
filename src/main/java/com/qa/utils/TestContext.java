package com.qa.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestContext {
    private static TestContext instance = null;
    public Map<Object,Object> datastore = new HashMap<>();

    private TestContext() { }

    public static TestContext getInstance() {
        if (instance == null) {
            instance = new TestContext();
        }
        return instance;
    }

     }
