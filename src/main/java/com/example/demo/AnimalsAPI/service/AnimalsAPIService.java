package com.example.demo.AnimalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.data.AnimalsAPIData;
import com.example.demo.AnimalsAPI.repository.AnimalsAPIRepository;

@Service
public class AnimalsAPIService {

	private final AnimalsAPIRepository animalsAPIRepository;

	public AnimalsAPIService(AnimalsAPIRepository animalsAPIRepository) {
		this.animalsAPIRepository = animalsAPIRepository;
	}

	public List<AnimalsAPIData> getAnimalsAPIData() throws IOException {

		AnimalsAPIData[] animalsList = animalsAPIRepository.getAnimalsAPIData();

		return Arrays.asList(animalsList); 
	}

	public List<AnimalsAPIData> getSpecificAnimalsAPIData(String animalsId) throws IOException {

		AnimalsAPIData[] hitAnimalsList = animalsAPIRepository.getSpecificAnimalsAPIData(animalsId);

		return Arrays.asList(hitAnimalsList);
	}
}