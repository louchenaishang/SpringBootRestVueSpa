package com.springbootvue.api.user.listener;

import com.springbootvue.api.user.event.UserRegisteredEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by louchen on 2017/7/10.
 */
@Component
public class UserEventListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @EventListener
    public void handle(UserRegisteredEvent userRegisteredEvent) {
        logger.info("userRegisteredEvent,{}",userRegisteredEvent.getUser());
    }

}
