package com.qf.config;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

public class JdbcConfig {

    @Value("${name}")
    private String username;

    @Value("${pwd}")
    private String password;

    @Value("${driver}")
    private String driver;

    @Value("${url}")
    private String url;

    @Test
    public void test() {
        System.out.println(url);
    }

}
