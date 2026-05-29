package fr.pernisi.demo1.terre;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TerreProperties.class)
@ComponentScan
@ConditionalOnProperty(
        prefix = TerreProperties.RACINE,
        name   = "enabled", havingValue = "true", matchIfMissing = true)
public class TerreConfiguration {


}
