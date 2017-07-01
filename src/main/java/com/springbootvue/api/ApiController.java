package com.springbootvue.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
