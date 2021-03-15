package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiveRev {

	// http://localhost:8080/addera?x=10&y=10
	@RequestMapping(method = RequestMethod.GET, path = "/addera")
	public String add(int x, int y) {
		int summa = x + y;
		return "Du har adderat " + x + " med " + y + " och fått " + summa;
	}

	// http://localhost:8080/subtrahera?x=10&y=10
	@RequestMapping(method = RequestMethod.GET, path = "/subtrahera")
	public String subtract(int x, int y) {
		int summa = x - y;
		return "Du har subtraherat " + x + " med " + y + " och fått " + summa;

	}

	// http://localhost:8080/multiplicera?x=10&y=10
	@RequestMapping(method = RequestMethod.GET, path = "/multiplicera")
	public String multiply(int x, int y) {
		int summa = x * y;
		return "Du har multiplicerat " + x + " med " + y + " och fått " + summa;
	}
}