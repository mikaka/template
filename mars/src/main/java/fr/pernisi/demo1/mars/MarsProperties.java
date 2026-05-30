package fr.pernisi.demo1.mars;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = MarsProperties.RACINE)
public class MarsProperties {

    public static final String RACINE="modules.mars";

    private boolean enabled = true;

}
