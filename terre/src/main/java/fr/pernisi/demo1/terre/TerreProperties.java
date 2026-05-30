package fr.pernisi.demo1.terre;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = TerreProperties.RACINE)
public class TerreProperties {

    public static final String RACINE="modules.terre";

    private boolean enabled = true;

}
