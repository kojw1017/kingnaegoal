package com.example.demo.controller;

import java.sql.Date;
import java.util.List;
import com.example.demo.dto.TestDto;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {
	private final TestService testService;

	// @GetMapping("/")
	// public String main() {
	// return "안녕 씨발아 산내골 게시판에 온걸 환영해~ 현재 시간은 " + new Date(0) + "\n";
	// }

	// @GetMapping("/")
	// public List<TestDto> test() {
	// return testService.getAllDataList();
	// }
}
