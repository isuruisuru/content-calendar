package com.eacis.contentcalendar;

import com.eacis.contentcalendar.model.Content;
import com.eacis.contentcalendar.model.Status;
import com.eacis.contentcalendar.model.Type;
import com.eacis.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			Content content = new Content(
					null,
					"Hello ChatGPT",
					"All about ChatGPT",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					""
			);
			repository.save(content);
		};
	}

}
