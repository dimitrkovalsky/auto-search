package com.liberty.autosearch.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * @author Dmytro_Kovalskyi.
 * @since 09.02.2017.
 */
@Configuration
@ComponentScan("com.liberty.autosearch")
@EnableScheduling
@EntityScan("com.liberty.autosearch.model")
public class Config {
    public static final int POOL_SIZE = 10;

    @Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(POOL_SIZE);
        return scheduler;
    }
}
