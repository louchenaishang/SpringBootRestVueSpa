package com.springbootvue.test;

import com.springbootvue.api.user.model.User;
import com.springbootvue.api.user.repository.UserRepository;
import com.test.base.BaseTest;
import com.test.base.RandomMock;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by louchen on 2017/7/5.
 */
public class UserTest extends BaseTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void init(){
        userRepository.deleteAll();
        for (int i = 0; i < 100; i++) {
            Map<String,String> data = RandomMock.getData();
            User user = new User();
            user.setName(data.get("name"));
            user.setTel(data.get("tel"));
            user.setPassword(data.get("tel"));
            user.setSex(data.get("sex"));
            user.setEmail(data.get("email"));
            user.setRoad(data.get("road"));
            userRepository.save(user);

            logger.info(data.toString());
        }
    }

}
