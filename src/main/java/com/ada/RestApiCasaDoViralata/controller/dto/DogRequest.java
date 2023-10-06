package com.ada.RestApiCasaDoViralata.controller.dto;
import com.ada.RestApiCasaDoViralata.utils.AnimalGender;
import com.ada.RestApiCasaDoViralata.utils.DogSize;
import lombok.Getter;

import java.util.Date;

@Getter
public class DogRequest {
    private String name;
    private Integer age;
    private String color;
    private Date admissionDate;
    private AnimalGender gender;
    private DogSize size;

}
