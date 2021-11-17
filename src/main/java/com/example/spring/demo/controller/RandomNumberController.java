package com.example.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.demo.service.RandomNumberService;

@RestController
@RequestMapping("/")
public class RandomNumberController {
	
	@Autowired
	private RandomNumberService randomNumberService;
	
	@GetMapping(path="/randomnumber", consumes="application/json")
	public List<Integer> getRandomNumbers(){
		
		return randomNumberService.getRandomNumbers();
	}

}
