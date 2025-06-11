package com.example.demo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api/hello")
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@GetMapping("world")
	public String getHello(@RequestParam(defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}

	@PostMapping
	public String postHello(@RequestBody HelloRequest request){
		return String.format("Hello updated to %s!", request.getName());
	}

	@PutMapping
	public String putHello(@RequestBody HelloRequest request) {
		return String.format("Hello updated to %s!", request.getName());
	}

	@DeleteMapping
	public String deleteHello(@RequestParam String name) {
		return String.format("Hello %s deleted!", name);
	}
}
