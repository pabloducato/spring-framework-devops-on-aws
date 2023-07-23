package pl.kocan.springframeworkdevopsonaws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringFrameworkDevopsOnAwsApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringFrameworkDevopsOnAwsApplication.class, args);
		} catch (RuntimeException ex) {
			log.info("An unexpected error has occured");
		}
	}
}
