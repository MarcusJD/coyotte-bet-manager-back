package br.com.coyottebm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter @Setter
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	private String login;
	
	@NonNull
	private String senha;
	
	private boolean ativo;
	
}
