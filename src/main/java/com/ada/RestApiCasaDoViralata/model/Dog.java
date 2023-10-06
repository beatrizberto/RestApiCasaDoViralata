package com.ada.RestApiCasaDoViralata.model;

import com.ada.RestApiCasaDoViralata.utils.AnimalGender;
import com.ada.RestApiCasaDoViralata.utils.DogSize;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table (name="dogs")
@Getter @Setter
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    private String color;

    @Column (name = "Entrada")
    private Date admissionDate;

    @Column (nullable = false)
    private AnimalGender gender;

    @Column (name= "porte")
    private DogSize size;

}
