package com.eacis.contentcalendar.controller;

import com.eacis.contentcalendar.config.ContentCalendarProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }
    @GetMapping("/")
    public ContentCalendarProperties home(){
        return properties;
    }
}
