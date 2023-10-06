package com.ada.RestApiCasaDoViralata.repository;

import com.ada.RestApiCasaDoViralata.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Integer> {

    User findByUserName (String userName);

    Integer findUserById (Integer id);


}
