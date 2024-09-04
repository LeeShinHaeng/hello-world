package com.example.mvcproject2.mission0904;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    @Qualifier("v6Engine")
    private Engine engine;
    @Autowired
    private ApplicationContext applicationContext;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(String engineName) {
        if (engineName.equals("V6")) {
            this.engine = applicationContext.getBean(V6Engine.class);
        } else if (engineName.equals("Electric")) {
            this.engine = applicationContext.getBean(ElectricEngine.class);
        } else {
            throw new IllegalArgumentException("Invalid engine");
        }
    }
}
