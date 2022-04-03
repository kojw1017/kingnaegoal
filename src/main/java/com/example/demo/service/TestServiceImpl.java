package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.TestDto;
import com.example.demo.mapper.TestMapper;

public class TestServiceImpl implements TestService{

    private TestMapper testMapper;

    @Override
    public List<TestDto> getAllDataList() {
        return testMapper.getAllDataList();
    }

}