package com.ada.RestApiCasaDoViralata.repository;

import com.ada.RestApiCasaDoViralata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Integer> {

    User findByUserName (String userName);

    Integer findUserById (Integer id);


}
