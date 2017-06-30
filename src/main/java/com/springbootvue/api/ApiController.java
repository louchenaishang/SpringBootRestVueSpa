package com.springbootvue.api;

import com.springbootvue.api.model.City;
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

    @GetMapping(path = "")
    public String home() {
        return "api";
    }


}
