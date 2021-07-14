package com.liuchuanhung.animalapi.services;

import com.liuchuanhung.animalapi.models.Animal;

import java.util.List;

public interface AnimalService {

    Animal getAnimalById(Long id);
    List<Animal> getAnimalsByColor(String color, Integer page, Integer size);
    List<Animal> getAnimalsByHobbiesType(String type, Integer page, Integer size);
    Animal createAnimal(Animal animal);
    void deleteAnimalById(Long id);
}