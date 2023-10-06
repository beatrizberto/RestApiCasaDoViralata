package com.ada.RestApiCasaDoViralata.service;

import com.ada.RestApiCasaDoViralata.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {

    @Autowired
    DogRepository dogRepository;


}
