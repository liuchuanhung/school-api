package com.liuchuanhung.animalapi.repositories;

import com.liuchuanhung.animalapi.models.Animal;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long> {

    List<Animal> findByColor(String color, Pageable pageable);
    List<Animal> findByHobbiesType(String type, Pageable pageable);
}