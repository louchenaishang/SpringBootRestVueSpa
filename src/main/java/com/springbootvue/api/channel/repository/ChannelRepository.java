package com.springbootvue.api.channel.repository;

import com.springbootvue.api.channel.model.Channel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by louchen on 2017/7/17.
 */
public interface ChannelRepository extends CrudRepository<Channel, String> {
}
