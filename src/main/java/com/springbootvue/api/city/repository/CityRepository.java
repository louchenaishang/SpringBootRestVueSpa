package com.springbootvue.api.city.repository;


import com.springbootvue.api.city.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by louchen on 2017/6/30.
 */
@Repository
public interface CityRepository extends MongoRepository<City, String>,CityRepositoryCustom {

    City findByName(final String name);

}
