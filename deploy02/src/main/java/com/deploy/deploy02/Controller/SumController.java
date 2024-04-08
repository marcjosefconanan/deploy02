package com.deploy.deploy02.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
@RestController
@RequestMapping("/somma")
public class SumController {
    @GetMapping("/random")
    public Integer getSumRandom(){
        Random random = new Random();
        Integer num1 = random.nextInt(100) + 1;
        Integer num2 = random.nextInt(100) + 1;
        Integer sumTot = num1 + num2;
        return sumTot;
    }
}