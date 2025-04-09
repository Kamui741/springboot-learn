package com.test.task;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledTasks {
    @Scheduled(fixedRate = 3000)
    public void taskService(){
      log.info("定时任务"+System.currentTimeMillis());
    }
}
