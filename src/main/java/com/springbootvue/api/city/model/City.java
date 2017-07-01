package com.springbootvue.api.city.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;


/**
 * Created by louchen on 2017/6/30.
 */
@Data
public class City {

    @Id
    private String id;

    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String name;

    private Date createTime = new Date();

}

