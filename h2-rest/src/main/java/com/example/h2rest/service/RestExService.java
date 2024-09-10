package com.example.h2rest.service;

import com.example.h2rest.dto.ItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RestExService {
    public boolean registerItem(ItemDto itemDto) {
        // DB에 저장
        log.info("service: register ...");
        return true;
    }


}
