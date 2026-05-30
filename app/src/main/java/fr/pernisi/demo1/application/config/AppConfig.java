package fr.pernisi.demo1.application.config;

import fr.pernisi.demo1.mars.MarsConfiguration;
import fr.pernisi.demo1.terre.TerreConfiguration;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Slf4j
@Configuration
@Import({TerreConfiguration.class, MarsConfiguration.class})
public class AppConfig {

    @PostConstruct
    public void initAppli() {

        log.info("Application configuration initialized");
    }

}