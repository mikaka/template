package fr.pernisi.demo1;

import fr.pernisi.demo1.mars.EnableMars;
import fr.pernisi.demo1.terre.EnableTerre;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableMars
@EnableTerre
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
