package com.example.spring.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomNumberService {
	
	public List<Integer> getRandomNumbers() {
		
		List<Integer> randomNumberList = new ArrayList<>();
		
		for (int i=1;i<=10;i++) {
			Random random = new Random();
			int low = 1;
			int high = 100;
			int randomNumber = random.nextInt(high-low) + low;
			randomNumberList.add(randomNumber);
		}
		
		return randomNumberList; 
		
	}

}
