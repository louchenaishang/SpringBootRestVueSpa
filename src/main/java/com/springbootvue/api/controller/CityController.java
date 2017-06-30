package com.springbootvue.api.controller;

import com.springbootvue.api.model.City;
import com.springbootvue.api.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by louchen on 2017/6/30.
 */
@RestController
@RequestMapping(path = "/api/city")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping(path = "")
    public List<City> getCityList() {
        return cityRepository.findAll();
    }

    @PostMapping(path = "")
    public City newOne(@RequestBody City city) {
        City newOne = cityRepository.save(city);
        return cityRepository.save(newOne);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteOne(@PathVariable String id) {
        cityRepository.delete(id);
        return true;
    }

}
