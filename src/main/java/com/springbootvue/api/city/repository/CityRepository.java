package com.springbootvue.api.city.repository;


import com.springbootvue.api.city.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by louchen on 2017/6/30.
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long>, CityRepositoryCustom {

    City findByName(final String name);

}
