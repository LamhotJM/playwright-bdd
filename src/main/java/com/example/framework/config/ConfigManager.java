package com.example.framework.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    private static final Properties props = new Properties();
    static {
        String env = System.getProperty("environment", "dev");
        try (InputStream is = ConfigManager.class.getResourceAsStream("/env.properties")) {
            props.load(is);
        } catch (Exception e) {
            throw new RuntimeException("Cannot load env.properties", e);
        }
        prefix = env + ".";
    }

    private static String prefix;

    public static String get(String key) {
        return props.getProperty(prefix + key);
    }
}
