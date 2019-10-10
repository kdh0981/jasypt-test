package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
    @Autowired
    TestMapper mapper;

    public User getUser() {
        return mapper.getUser();
    }
}
