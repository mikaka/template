package fr.pernisi.demo1.application;

import fr.pernisi.demo1.mars.EnableMars;
import fr.pernisi.demo1.terre.EnableTerre;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
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
