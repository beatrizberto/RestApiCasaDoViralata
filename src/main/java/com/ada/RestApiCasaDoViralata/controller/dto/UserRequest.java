package com.ada.RestApiCasaDoViralata.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
@AllArgsConstructor
public class UserRequest {

    @NotBlank(message = "O campo userName não pode estar vazio.")
    @Length(min = 3, max = 35)
    private String userName;
    private Integer password;

}
