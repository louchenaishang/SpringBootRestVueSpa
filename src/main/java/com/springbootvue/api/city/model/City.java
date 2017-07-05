package com.springbootvue.api.city.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;


/**
 * Created by louchen on 2017/6/30.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    private String id;

    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String name;

    private Date createTime = new Date();

}

