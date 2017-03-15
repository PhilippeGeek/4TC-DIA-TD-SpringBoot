package fr.insalyon.tc.dia.springboot;

import fr.insalyon.tc.dia.springboot.hello.ConsoleGreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Bean
	public CommandLineRunner greetingCommandLine(ConsoleGreetingService greetingService) {
		return args -> {
            greetingService.greet("Spring");
        };
	}
}
