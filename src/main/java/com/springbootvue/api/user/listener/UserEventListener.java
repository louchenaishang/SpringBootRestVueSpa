package com.springbootvue.api.user.listener;

import com.springbootvue.api.user.event.UserRegisteredEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by louchen on 2017/7/10.
 */
@Component
@Slf4j
public class UserEventListener {

    @EventListener
    public void handle(UserRegisteredEvent userRegisteredEvent) {
        log.info("userRegisteredEvent,{}",userRegisteredEvent.getUser());
    }

}
