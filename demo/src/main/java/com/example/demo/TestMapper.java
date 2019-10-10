package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    User getUser();
}
