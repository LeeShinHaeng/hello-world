package com.example.mvcproject2.mission0904;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RacingGameController {
    @Autowired
    private Car car;

    // http://localhost:8080/race
    // http://localhost:8080/race?engine=V6
    // http://localhost:8080/race?engine=Electric
    @GetMapping("/race")
    @ResponseBody
    public String race(@RequestParam(defaultValue = "V6") String engine) {
        car.setEngine(engine);
        return car.getEngine().start();
    }
}
