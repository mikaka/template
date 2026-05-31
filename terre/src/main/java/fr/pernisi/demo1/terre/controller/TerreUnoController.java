package fr.pernisi.demo1.terre.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@AllArgsConstructor
@RequestMapping("/terre/uno")
public class TerreUnoController {

    private final fr.pernisi.demo1.terre.service.IB tService;

    @org.springframework.web.bind.annotation.GetMapping
    public String hello() {
        return tService.sayGoodBye();
    }

}
