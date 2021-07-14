package com.liuchuanhung.animalapi.controllers;

import com.liuchuanhung.animalapi.models.Animal;
import com.liuchuanhung.animalapi.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/{id}")
    public Animal getAnimalById(@PathVariable("id") Long id) {
        return animalService.getAnimalById(id);
    }

    @GetMapping
    public List<Animal> getAnimalsByColor(
            @RequestParam String color,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "5") Integer size) {
        return animalService.getAnimalsByColor(color, page, size);
    }

    @GetMapping("/hobbies")
    public List<Animal> getAnimalsByHobbiesType(
            @RequestParam String type,
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "5") Integer size) {
        return animalService.getAnimalsByHobbiesType(type, page, size);
    }

    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.createAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimalById(@PathVariable("id") Long id) {
        animalService.deleteAnimalById(id);
    }
}