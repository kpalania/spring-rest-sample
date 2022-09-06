package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HotelController {

	private static final String template = "hey, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hotel")
	public Hotel hotel(@RequestParam(value = "name", defaultValue = "Carlton") String name) {
		return new Hotel(counter.incrementAndGet(), String.format(template, name));
	}
}
