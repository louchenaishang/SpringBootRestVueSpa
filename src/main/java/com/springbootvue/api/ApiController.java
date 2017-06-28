package com.springbootvue.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by louchen on 2017/6/28.
 */
@RestController
@RequestMapping(path = "/api")
public class ApiController {

    @GetMapping(path = "/city")
    public List<DataListOptions> gegetOptions() {
        final List<DataListOptions> result = new LinkedList<>();

        Integer i = 0;
        while (i < 1) {
            result.add(new DataListOptions("上海"+i, "shanghai"+i));
            result.add(new DataListOptions("北京"+i, "beijing"+i));
            result.add(new DataListOptions("广东"+i, "guangdong"+i));
            i++;
        }

        return result;
    }

    public static class DataListOptions {

        public String name;
        public String value;

        public DataListOptions() {
        }

        public DataListOptions(final String name, final String value) {
            this.name = name;
            this.value = value;
        }
    }

}
