package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import com.example.demo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {

	@GetMapping("/hello")
	public List<String> hello() {
		return Arrays.asList("안녕하세요1", "Hello");
	}
}