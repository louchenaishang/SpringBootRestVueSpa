package com.springbootvue.test;

import com.springbootvue.api.channel.model.Channel;
import com.springbootvue.api.channel.repository.ChannelRepository;
import com.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by louchen on 2017/7/17.
 */
public class ChannelTest extends BaseTest {

    @Autowired
    private ChannelRepository channelRepository;

    @Test
    public void create(){
        Channel channel = new Channel();
        channel.setName("abc");
        channelRepository.save(channel);
    }

}
