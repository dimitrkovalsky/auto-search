package com.liberty.autosearch;

import com.liberty.autosearch.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Dmytro_Kovalskyi.
 * @since 09.02.2017.
 */
@SpringBootApplication
public class ServerRunner {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(new Class<?>[]{Config.class}, args);

        System.out.println("Application started...");
    }
}
