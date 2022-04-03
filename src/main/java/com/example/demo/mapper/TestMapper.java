package com.example.demo.mapper;

import java.util.List;

import com.example.demo.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<TestDto> getAllDataList();
}