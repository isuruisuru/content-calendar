package com.eacis.contentcalendar;

import com.eacis.contentcalendar.config.ContentCalendarProperties;
import com.eacis.contentcalendar.model.Content;
import com.eacis.contentcalendar.model.Status;
import com.eacis.contentcalendar.model.Type;
import com.eacis.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
