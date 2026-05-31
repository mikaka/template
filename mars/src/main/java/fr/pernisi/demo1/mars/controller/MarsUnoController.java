package fr.pernisi.demo1.mars.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/mars/uno")
public class MarsUnoController {

    private final fr.pernisi.demo1.mars.service.IA aService;

    @org.springframework.web.bind.annotation.GetMapping
    public String hello() {
        return aService.sayHello();
    }

}
