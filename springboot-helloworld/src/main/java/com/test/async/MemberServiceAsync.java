package com.test.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MemberServiceAsync {
    @Async
    public String sms(){
        log.info(">02<");
        try {
            log.info(">senting<");
            Thread.sleep(5000);
        }catch (Exception e){

        }
        log.info(">03<");
        return "sms";
    }
}
