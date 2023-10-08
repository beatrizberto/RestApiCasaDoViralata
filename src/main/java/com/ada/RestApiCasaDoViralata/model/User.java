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

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column (name = "password", nullable = false)
    private Integer password;

    private boolean active;


}
