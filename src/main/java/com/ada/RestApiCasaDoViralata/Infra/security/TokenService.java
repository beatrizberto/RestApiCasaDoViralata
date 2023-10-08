package com.ada.RestApiCasaDoViralata.Infra.security;

import com.ada.RestApiCasaDoViralata.model.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TokenService {

   // private String secretKey;

    public String tokenGenerate(User user) {
        try {
            Algorithm algorithm = Algorithm.HMAC512("1234");

            return JWT.create()
                    .withSubject(user.getEmail())
                    .withClaim("id", user.getId())
                    .withClaim("name", user.getName())
                    .withExpiresAt(new Date(System.currentTimeMillis() + 3600000)) //horario do sistema
                    .withIssuer("Ada Tech")
                    .sign(algorithm);

        } catch (JWTCreationException exception){
            throw new RuntimeException("Erro ao gerar token", exception);
        }


    }
}
