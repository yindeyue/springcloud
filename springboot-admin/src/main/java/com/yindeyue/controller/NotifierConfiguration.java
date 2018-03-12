package com.yindeyue.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import de.codecentric.boot.admin.notify.Notifier;
import de.codecentric.boot.admin.notify.RemindingNotifier;

@Configuration
@EnableScheduling
public class NotifierConfiguration {
    @Autowired
    private Notifier notifier;

    @Bean
    @Primary
    public RemindingNotifier remindingNotifier() {
        RemindingNotifier remindingNotifier = new RemindingNotifier(notifier);
        remindingNotifier.setReminderPeriod(TimeUnit.SECONDS.toMillis(5)); 
        return remindingNotifier;
    }

    @Scheduled(fixedRate = 5_000L) 
    public void remind() {
        remindingNotifier().sendReminders();
    }
}
