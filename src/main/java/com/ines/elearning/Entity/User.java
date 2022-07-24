package com.ines.elearning.Entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Builder
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;


    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;



    @Column(name = "password")
    @NotNull
    private String password;

    @Transient
    @NotNull
    private String passwordConfirm;

    @Column(name = "email")
    private String email;



    @Column(name = "age")
    private int age;

    @Column(name = "tel")
    private String tel;




    @Column(name = "Role")
    @Enumerated(EnumType.STRING)

    private Role role;

}
