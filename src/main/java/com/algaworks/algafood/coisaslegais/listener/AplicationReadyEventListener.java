package com.algaworks.algafood.coisaslegais.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.context.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AplicationReadyEventListener {

    @EventListener
    public void applicationStartedEventListener(ApplicationStartedEvent applicationStartedEvent) {
        log.info(applicationStartedEvent.toString());
    }

    @EventListener
    public void applicationStartedEventListener(ApplicationContextInitializedEvent applicationContextInitializedEvent) {
        log.info(applicationContextInitializedEvent.toString());
    }

    @EventListener
    public void applicationEnvironmentPreparedEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        log.info(applicationEnvironmentPreparedEvent.toString());
    }

    @EventListener
    public void applicationFailedEvent(ApplicationFailedEvent applicationFailedEvent) {

        log.info(applicationFailedEvent.toString());
    }

    @EventListener
    public void applicationPreparedEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        log.info(applicationPreparedEvent.toString());
    }

    @EventListener
    public void applicationReadyEvent(ApplicationReadyEvent applicationReadyEvent) {
        log.info(applicationReadyEvent.toString());
    }

    @EventListener
    public void applicationStartingEvent(ApplicationStartingEvent applicationStartingEvent) {
        log.info(applicationStartingEvent.toString());
    }

    @EventListener
    public void exitCodeEvent(ExitCodeEvent exitCodeEvent) {
        log.info(exitCodeEvent.toString());
    }
}
