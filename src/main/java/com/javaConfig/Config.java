package com.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.javaConfig.Emp")
public class Config {

    @Bean
    public Address address(){
        return new Address();
    }

    @Bean
    public Emp getEmp(){
        return new Emp(address());
    }

}
