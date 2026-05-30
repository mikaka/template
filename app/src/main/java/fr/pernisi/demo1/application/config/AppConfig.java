package fr.pernisi.demo1.application.config;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AppConfig {

    @PostConstruct
    public void initAppli() {
        log.info("Application configuration initialized");
    }

}