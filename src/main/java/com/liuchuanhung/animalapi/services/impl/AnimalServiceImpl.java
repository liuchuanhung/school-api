package com.liuchuanhung.animalapi.services.impl;

import com.liuchuanhung.animalapi.models.Animal;
import com.liuchuanhung.animalapi.repositories.AnimalRepository;
import com.liuchuanhung.animalapi.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Animal getAnimalById(Long id) {
        Optional<Animal> animalOptional = animalRepository.findById(id);
        return (animalOptional.isPresent()) ? animalOptional.get(): null;
    }

    public List<Animal> getAnimalsByColor(String color, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return animalRepository.findByColor(color, pageable);
    }

    public List<Animal> getAnimalsByHobbiesType(String type, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        return animalRepository.findByHobbiesType(type, pageable);
    }

    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public void deleteAnimalById(Long id) {
        animalRepository.deleteById(id);
    }
}