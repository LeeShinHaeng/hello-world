package com.example.h2rest.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ExMapper {

    HashMap<String, Object> findById(HashMap<String, Object> paramMap);

    void registerItem(HashMap<String, Object> paramMap);
}