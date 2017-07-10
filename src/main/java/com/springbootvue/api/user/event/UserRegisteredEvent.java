package com.springbootvue.api.user.event;

import com.springbootvue.api.user.model.User;

/**
 * Created by louchen on 2017/7/10.
 */
public class UserRegisteredEvent extends UserEvent {

    /**
     * 构造方法
     *
     * @param source 事件源
     * @param user
     */
    public UserRegisteredEvent(Object source, User user) {
        super(source, user);
    }

}
