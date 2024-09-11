package com.example.h2rest.service;

import com.example.h2rest.dto.ItemDto;
import com.example.h2rest.entity.ItemEntity;
import com.example.h2rest.mapper.ExMapper;
import com.example.h2rest.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j
@RequiredArgsConstructor
public class RestExService {
    private final ExMapper exMapper;
    private final ItemRepository itemRepository;

//    public boolean registerItem(ItemDto itemDto) {
//        // DB에 저장
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("id", itemDto.getId());
//        paramMap.put("name", itemDto.getName());
//
//        exMapper.registerItem(paramMap);
//
//        log.info("service: register ...");
//        return true;
//    }

//    public ItemDto getItemById(String id) {
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("id", id);
//
//        HashMap<String, Object> result = exMapper.findById(paramMap);
//
//        ItemDto itemDto = new ItemDto();
//        itemDto.setId(result.get("ID").toString());
//        itemDto.setName(result.get("NAME").toString());
//
//        return itemDto;
//    }

    public boolean registerItem(ItemDto itemDto) {
        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setName(itemDto.getName());
        itemEntity.setId(itemDto.getId());
        itemRepository.save(itemEntity);

        log.info("service: register ...");
        return true;
    }

    public ItemDto getItemById(String id) {
        ItemEntity itemEntity = itemRepository.findById(id).get();

        ItemDto itemDto = new ItemDto();
        itemDto.setId(itemEntity.getId());
        itemDto.setName(itemEntity.getName());
        return itemDto;
    }

}
