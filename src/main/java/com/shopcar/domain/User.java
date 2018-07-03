package com.shopcar.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 29.06.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String login;
    @NotNull
    private String password;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String phone;

}
