package com.example.demo.service;

import com.example.demo.dao.testMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class testServiceImpl implements testService {
    @Autowired
    private testMapper testMapper;
    @Override
    public List<Map<String, Object>> list() {
        return testMapper.list();
    }
}
