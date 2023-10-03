package com.ada.RestApiCasaDoViralata.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserRequest {

    private String userName;
    private Integer password;

}
