




package fr.pernisi.demo1.terre;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ConditionalOnProperty(
        prefix = TerreProperties.RACINE,
        name = "enabled",
        havingValue = "true",
        matchIfMissing = false
)
public @interface EnableTerre {
}
