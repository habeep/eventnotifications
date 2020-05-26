package com.publish.event.notifications.webhook.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.publish.event.notifications.webhook.model.HealthInfo;
import com.publish.event.notifications.webhook.model.Notification;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import org.springframework.http.HttpStatus;

@RestController
@Slf4j
public class NotificationsController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/notifications")
    public ResponseEntity create(@RequestBody List<Notification> notifications) {
    	 if (notifications == null) {
    		 log.info("done");
             log.info("Received empty notification list {} ", notifications);
         } else {
        	 log.info("Received {} Number of notification ", notifications.size());
             for (Notification notification : notifications) {
            	 log.info("Notification payload {} ", notification);
             }
         }
         return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping(path = "/health")
	public HealthInfo healthInfo() {
		return new HealthInfo("Service is UP");
	}
    
}