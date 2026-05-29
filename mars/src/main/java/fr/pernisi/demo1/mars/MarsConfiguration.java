package fr.pernisi.demo1.mars;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MarsProperties.class)
@ComponentScan
@ConditionalOnProperty(
        prefix = MarsProperties.RACINE,
        name   = "enabled", havingValue = "true", matchIfMissing = true)
public class MarsConfiguration {


}
