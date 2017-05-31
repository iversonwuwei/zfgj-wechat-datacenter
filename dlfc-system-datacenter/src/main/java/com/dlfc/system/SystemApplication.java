package com.dlfc.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by K on 2017/5/29.
 */

//@SpringBootApplication
@SpringCloudApplication
@ComponentScan(basePackages = "com.dlfc.system")
@MapperScan(basePackages = "com.dlfc.system.mapper")
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
