package com.ada.RestApiCasaDoViralata.service;

import com.ada.RestApiCasaDoViralata.controller.dto.UserRequest;
import com.ada.RestApiCasaDoViralata.controller.dto.UserResponse;
import com.ada.RestApiCasaDoViralata.model.User;
import com.ada.RestApiCasaDoViralata.repository.UserRepository;
import com.ada.RestApiCasaDoViralata.utils.UserConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserResponse saveUSer(UserRequest userDTO){
        User user = UserConvert.toEntity(userDTO);
        user.setActive(true);
        User userEntity = userRepository.save(user);

        return UserConvert.toResponse(userEntity);

    }

    public List<UserResponse> getUsers() {
        List<User> users = userRepository.findAll();
        return UserConvert.toResponseList(users);

    }

    public UserResponse getUserById(Integer id) {

        return UserConvert.toResponse(userRepository.findById(id).get());
    }

    public UserResponse getUserByEmail(String email) {
return UserConvert.toResponse(userRepository.findByEmail(email));

    }


    public UserResponse getUserByName(String userName) {
        return UserConvert.toResponse((userRepository.findByName(userName)).get());

            }

    public UserResponse updateUser (Integer id, UserRequest userRequest){
        User user = UserConvert.toEntity(userRequest);
        user.setId(id);
        return UserConvert.toResponse(userRepository.save(user));

    }

    public void deleteUser(Integer id){
       User user = userRepository.findById(id).get();
       user.setActive(false);
       userRepository.save(user);
    }


}
