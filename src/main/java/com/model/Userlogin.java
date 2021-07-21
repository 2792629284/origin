package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "userlogin")
public class Userlogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Nickname", nullable = false)
    private String nickname;

    @Column(name = "Username", nullable = false)
    private String username;

    @JsonIgnore                                   //隐藏密码
    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Tnumber", nullable = false)
    private String tnumber;

    @Column(name = "Email", nullable = false)
    private String email;


}
