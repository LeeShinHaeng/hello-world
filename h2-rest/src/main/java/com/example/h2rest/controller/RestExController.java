package com.example.h2rest.controller;

import com.example.h2rest.dto.ItemDto;
import com.example.h2rest.dto.UserDto;
import com.example.h2rest.dto.ResponseItemDto;
import com.example.h2rest.service.RestExService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
public class RestExController {

    private final RestExService restExService;

    // http://localhost:8080/swagger-ui/index.html
    // http://localhost:8080/test
    @GetMapping("/test")
    public String test() {
        log.info("test");
        return "{}";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }

    // http://localhost:8080/param?name=Spring
    @GetMapping("/param")
    public String testRequestParam(@RequestParam String name) {
        log.info("RequestParam {}", name);

        return "Request Param " + name;
    }

    // http://localhost:8080/path/Spring
    @GetMapping("/path/{name}")
    public String testPathVariable(@PathVariable String name) {
        log.info("PathVariable {}", name);
        return "Path Variable " + name;
    }


    // http://localhost:8080/body
    @PostMapping("/body")
    public String testRequestBody(@RequestBody UserDto user) {
        log.info("RequestBody {}", user);
        return "Request Body " + user;
    }

    // http://localhost:8080/item?id=1
    @GetMapping("/item")
    public ItemDto getItem(@RequestParam String id) {
        return restExService.getItemById(id);
    }


    // http://localhost:8080/item
    @PostMapping("/item")
    public ResponseItemDto testRequestBody(@RequestBody ItemDto item) {
        log.info("RequestBody {}", item);

        boolean b = restExService.registerItem(item);
        ResponseItemDto responseItemDto = new ResponseItemDto();

        if(b) {
            responseItemDto.setMessage("ok");
            return responseItemDto;
        }

        responseItemDto.setMessage("fail");
        return responseItemDto;
    }



}
