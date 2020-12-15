package br.com.coyottebm.config.property;


import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("coyottebm")
@Getter @Setter
public class CoyotteBetManagerApiProperty {

	private boolean habilitaHttps;
	private String originPermitida = "http://localhost:4200";;
}
