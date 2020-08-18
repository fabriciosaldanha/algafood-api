package com.algaworks.algafood.coisaslegais.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationListener {

    @EventListener
    private void listener(NotificationEvent event){
        log.info(Thread.currentThread().getName() + " - " + event.toString());
    }
}
