package com.example.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Anno {
@GetMapping(value="/getCar")
	public Car getcars(@RequestBody Car c) {
	
	c.setPrice(c.getPrice()+(c.getPrice()*3/100));
	return c;
}

}
