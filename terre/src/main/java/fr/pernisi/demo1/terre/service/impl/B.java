package fr.pernisi.demo1.terre.service.impl;

import fr.pernisi.demo1.terre.service.IB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class B implements IB {

    public  String sayGoodBye() {
        return "GoodBye from Mars!";
    }

}
