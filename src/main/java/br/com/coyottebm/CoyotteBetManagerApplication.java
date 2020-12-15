package br.com.coyottebm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.coyottebm.config.property.CoyotteBetManagerApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(CoyotteBetManagerApiProperty.class)
public class CoyotteBetManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoyotteBetManagerApplication.class, args);
	}

}
