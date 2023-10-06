package com.ada.RestApiCasaDoViralata.repository;

import com.ada.RestApiCasaDoViralata.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository <Dog, Integer>{

}
