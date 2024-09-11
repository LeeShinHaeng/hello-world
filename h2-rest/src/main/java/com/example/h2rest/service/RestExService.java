package com.example.h2rest.service;

import com.example.h2rest.dto.ItemDto;
import com.example.h2rest.entity.ItemEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RestExService {
//    private final ExMapper exMapper;
//    private final ItemRepository itemRepository;

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

    private final SessionFactory sessionFactory;

    public boolean registerItem(ItemDto itemDto) {
        // hibernate session 사용
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        ItemEntity itemEntity = new ItemEntity();
        itemEntity.setName(itemDto.getName());
        itemEntity.setId(itemDto.getId());
//        itemRepository.save(itemEntity);

        session.save(itemEntity);
        session.getTransaction().commit();
        session.close();

        log.info("service: register ...");
        return true;
    }

    public ItemDto getItemById(String id) {
//        ItemEntity itemEntity = itemRepository.findById(id).get();

        Session session = sessionFactory.openSession();
        ItemEntity itemEntity = session.get(ItemEntity.class, id);
        session.close();

        if(itemEntity == null) {
            return null;
        }

        ItemDto itemDto = new ItemDto();
        itemDto.setId(itemEntity.getId());
        itemDto.setName(itemEntity.getName());
        return itemDto;
    }

}
