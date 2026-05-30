package fr.pernisi.demo1.terre;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(TerreProperties.class)
@ComponentScan
@ConditionalOnProperty(
        prefix = TerreProperties.RACINE,
        name   = "enabled", havingValue = "true", matchIfMissing = false)
public class TerreConfiguration {

    @PostConstruct
    public void init() {
        log.info("Terre module initialized");
    }

}
