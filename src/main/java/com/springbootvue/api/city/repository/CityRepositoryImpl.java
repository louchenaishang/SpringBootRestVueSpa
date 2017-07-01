package com.springbootvue.api.city.repository;

import com.springbootvue.api.city.model.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by louchen on 2017/7/1.
 */
public class CityRepositoryImpl implements CityRepositoryCustom {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Long countNameCustom(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").regex(name));
//        BasicQuery query = new BasicQuery("{\"name\": {$regex : '" + name + "'} }");
        return mongoTemplate.count(query, City.class);
    }

}
