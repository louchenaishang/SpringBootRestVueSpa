package com.springbootvue.test;

import com.springbootvue.api.channel.model.Channel;
import com.springbootvue.api.channel.repository.ChannelRepository;
import com.springbootvue.api.user.model.User;
import com.springbootvue.api.user.repository.UserRepository;
import com.test.base.BaseTest;
import com.test.base.RandomMock;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by louchen on 2017/7/17.
 */
public class ChannelTest extends BaseTest {

    @Autowired
    private ChannelRepository channelRepository;

    @Test
    public void create(){
        Channel channel = new Channel();
        channel.setName("abc"+ RandomUtils.nextInt(1,100));
        channelRepository.save(channel);
    }

}
