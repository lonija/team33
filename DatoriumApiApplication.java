package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		System.out.println("asd");
		SpringApplication.run(DatoriumApiApplication.class, args);
	}


	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name); // "Hello " + name;
	}

	@GetMapping("/sum")
	public int sum(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2){
		return number1 + number2;
	}

	@GetMapping("/multiply")
	public int multiply(@RequestParam(value = "number1") int number1, @RequestParam(value = "number2") int number2){
		return number1 * number2;
	}

	//Create an array in the endpoint, fill the array with data and access it from the URL
	@GetMapping("/cats")
	public String[] cats(@RequestParam(value = "cat1") String cat1, @RequestParam(value = "cat2") String cat2) {
		String[] cats = {cat1, cat2};
		return cats;
	}

	@GetMapping("/getNamesOfElinasCats")
	public List<String> getNamesOfElinasCats() {
		return Arrays.asList("Lesya", "Shprotik");
	}

	//Create an object (new class, cheese or wine or whatever) in the endpoint,
	// fill the object, access it from the URL

	/*
	two-dimensional array
	 */
	@GetMapping("/draw")
	public int[][] draw() {
		return new int[][]{
				new int[]{1, 0, 1, 0, 1},
				new int[]{0, 1, 0, 1, 0},
				new int[]{1, 0, 1, 0, 1},
				new int[]{0, 1, 0, 1, 0},
				new int[]{1, 0, 1, 0, 1}
		};
	}

}
