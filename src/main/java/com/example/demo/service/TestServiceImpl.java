package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.TestDto;
import com.example.demo.mapper.TestMapper;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<TestDto> getAllDataList() {
        return testMapper.getAllDataList();
    }
}