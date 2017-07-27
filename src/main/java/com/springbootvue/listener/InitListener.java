package com.springbootvue.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InitListener {

    @Value("${sys.version}")
    private String systemVersion;


    @Value("${sys.tmpdir}")
    private String tmpdir;

    /**
     * 事件处理
     *
     * @param contextRefreshedEvent ContextRefreshedEvent
     */
    @EventListener
    public void handle(ContextRefreshedEvent contextRefreshedEvent) {
        if (contextRefreshedEvent.getApplicationContext() == null || contextRefreshedEvent.getApplicationContext().getParent() != null) {
            return;
        }
        log.info("Initializing Project version:{},tmpdir:{}", systemVersion, tmpdir);
    }

}
