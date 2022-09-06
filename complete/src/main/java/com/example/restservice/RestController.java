package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import java.util.concurrent.atomic.AtomicLong;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	private static final String template = "hey, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/employee")
	public String employee(@RequestParam(value = "id") String id) {
		final String uri = String.format("https://dummy.restapiexample.com/api/v1/employee/%s", id);

		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);

		return result;
	}
}
