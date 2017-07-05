package com.springbootvue.test;

import com.springbootvue.api.city.model.City;
import com.springbootvue.api.city.repository.CityRepository;
import com.test.base.BaseTest;
import com.test.base.RandomMock;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by louchen on 2017/7/5.
 */
public class CityTest extends BaseTest {

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void findAll(){
        List<City> all = cityRepository.findAll();
        assertEquals(true, all!=null&&all.size()>0);
    }

    @Test
    public void test(){
        for (int i = 0; i < 100; i++) {
            System.out.println(RandomMock.getData());
        }
    }

}
