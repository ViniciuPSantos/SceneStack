package scenestack_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ScenestackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScenestackApplication.class, args);
	}

}
