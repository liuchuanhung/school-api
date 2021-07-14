package com.liuchuanhung.animalapi.models;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "color")
    private String color;

    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL)
    private List<Hobby> hobbies = new ArrayList<>();
}