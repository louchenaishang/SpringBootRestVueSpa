package com.springbootvue.api.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;


/**
 * Created by louchen on 2017/7/05.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String id;

    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String name;

    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String tel;

    private String password;

    private String sex;

    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String email;

    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String road;

    private Date createTime = new Date();

}

