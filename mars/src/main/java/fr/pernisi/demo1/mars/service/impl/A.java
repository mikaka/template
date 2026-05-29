package fr.pernisi.demo1.mars.service.impl;

import fr.pernisi.demo1.mars.service.IA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class A implements IA {


    public String sayHello() {
        return "Hello from Mars!";
    }

}
