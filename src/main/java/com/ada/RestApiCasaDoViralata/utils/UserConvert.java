package com.ada.RestApiCasaDoViralata.utils;

import com.ada.RestApiCasaDoViralata.controller.dto.UserRequest;
import com.ada.RestApiCasaDoViralata.controller.dto.UserResponse;
import com.ada.RestApiCasaDoViralata.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserConvert {

    public static User toEntity(UserRequest userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setPassword(userDTO.getPassword());

        return user;
    }

    public static UserResponse toResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setUserName(user.getUserName());

        return userResponse;
    }

    public static List<UserResponse> toResponseList(List<User> users) {
        List<UserResponse> userResponses = new ArrayList<>();
        for (User user : users) {
            UserResponse userResponse = UserConvert.toResponse(user);
            userResponses.add(userResponse);
        }

        //TODO: tentar fazer esse processo com stream

        return userResponses;

    }
}


