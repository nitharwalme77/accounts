package com.example.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableFeignClients
@SpringBootApplication
//@Scope("refresh")
@RefreshScope
@ComponentScans({ @ComponentScan("com.example.accounts.controller") })
@EnableJpaRepositories("com.example.accounts.repository")
@EntityScan("com.example.accounts.model")
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }
}