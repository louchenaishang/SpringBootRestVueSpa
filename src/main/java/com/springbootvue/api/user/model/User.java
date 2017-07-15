package com.springbootvue.api.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;


/**
 * Created by louchen on 2017/7/05.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String tel;

    @Column
    private String password;

    @Column
    private String sex;

    @Column
    private String email;

    @Column
    private String road;

    @Column
    private Date createTime = new Date();

}

