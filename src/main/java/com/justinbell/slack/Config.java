package com.justinbell.slack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by 4Just on 7/1/2015.
 */
public class Config {

    private static Config config;

    public static Config getInstance() {
        if (config == null)
            config = new Config();
        return config;
    }

    private Config() {
        valid = true;
        try {
            InputStream inputStream = new FileInputStream("config.properties");
            Properties properties = new java.util.Properties();
            properties.load(inputStream);
            authToken = properties.getProperty("authToken");
            username = properties.getProperty("username");
        } catch (IOException e) {
            valid = false;
        }
    }

    private String authToken;

    private String username;

    private Boolean valid;

    public static String getAuthToken() {
        return Config.getInstance().authToken;
    }

    public static String getUsername() {
        return Config.getInstance().username;
    }

    public static Boolean isValid() {
        return Config.getInstance().valid;
    }
}
