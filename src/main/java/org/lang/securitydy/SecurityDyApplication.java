package org.lang.securitydy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "org.lang.securitydy.mapper")
public class SecurityDyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDyApplication.class, args);
    }

}
