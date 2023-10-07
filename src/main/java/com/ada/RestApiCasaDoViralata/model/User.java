package com.ada.RestApiCasaDoViralata.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table (name = "users")
@Where(clause = "active is true")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="user name", nullable = false, unique = true)
    private String userName;

    @Column (name = "password", nullable = false)
    private Integer password;

    private boolean active;


}
