package fr.pernisi.demo1.mars;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ConditionalOnProperty(
        prefix = MarsProperties.RACINE,
        name = "enabled",
        havingValue = "true",
        matchIfMissing = false
)
public @interface EnableMars {
}
