package com.example.h2rest.service;

import com.example.h2rest.dto.ItemDto;
import com.example.h2rest.mapper.ExMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j
@RequiredArgsConstructor
public class RestExService {
    private final ExMapper exMapper;

    public boolean registerItem(ItemDto itemDto) {
        // DB에 저장
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", itemDto.getId());
        paramMap.put("name", itemDto.getName());

        exMapper.registerItem(paramMap);

        log.info("service: register ...");
        return true;
    }

    public ItemDto getItemById(String id) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", id);

        HashMap<String, Object> result = exMapper.findById(paramMap);

        ItemDto itemDto = new ItemDto();
        itemDto.setId(result.get("ID").toString());
        itemDto.setName(result.get("NAME").toString());

        return itemDto;
    }

}
