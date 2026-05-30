package fr.pernisi.demo1.mars;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(MarsProperties.class)
@ComponentScan
@ConditionalOnProperty(
        prefix = MarsProperties.RACINE,
        name   = "enabled", havingValue = "true", matchIfMissing = false)
public class MarsConfiguration {

    @PostConstruct
    public void init() {
       log.info("Mars module initialized");
    }


}
