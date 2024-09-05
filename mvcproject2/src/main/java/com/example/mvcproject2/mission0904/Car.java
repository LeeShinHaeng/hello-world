package com.example.mvcproject2.mission0904;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Map;

@Component
@RequestScope   // 요청 스코프, 매 요청마다 빈 인스턴스 생성
public class Car {
    private final Map<String, Engine> engines;
    private Engine engine;

    @Autowired
    public Car(Map<String, Engine> engines) {
        this.engines = engines;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(String engineType) {
        this.engine = engines.get(engineType.toLowerCase() + "Engine");
    }

//    private ApplicationContext applicationContext;
//
//    @Autowired
//    public Car(@Qualifier("electricEngine") Engine engine) {
//        this.engine = engine;
//    }
//
//    public void setEngine(String engineName) {
//        if (engineName.equals("V6")) {
//            this.engine = applicationContext.getBean(V6Engine.class);
//        } else if (engineName.equals("Electric")) {
//            this.engine = applicationContext.getBean(ElectricEngine.class);
//        } else {
//            throw new IllegalArgumentException("Invalid engine");
//        }
//    }
}
