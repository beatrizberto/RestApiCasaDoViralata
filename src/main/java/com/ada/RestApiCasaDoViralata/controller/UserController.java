package com.ada.RestApiCasaDoViralata.controller;

import com.ada.RestApiCasaDoViralata.controller.dto.UserRequest;
import com.ada.RestApiCasaDoViralata.controller.dto.UserResponse;
import com.ada.RestApiCasaDoViralata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserResponse> getUsers() {

        return userService.getUsers();
    }


    @PostMapping
    public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest userDTO) {

        UserResponse user = userService.saveUSer(userDTO);
        return ResponseEntity.created(URI.create("/user/"+user.getId())).body(user);

    }

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Integer id){

        return userService.getUserById(id);
    }

    @GetMapping("/username/{userName}")
    public UserResponse getUserByUserName(@PathVariable String userName){
        return userService.getUserByUserName(userName);
    }

}
