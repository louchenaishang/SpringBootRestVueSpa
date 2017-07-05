package com.test.base;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by louchen on 2017/7/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

}
