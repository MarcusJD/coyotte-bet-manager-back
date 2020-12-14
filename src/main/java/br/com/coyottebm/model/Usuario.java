package br.com.coyottebm.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter @Setter
public class Usuario {
	
	@Id
	private Long id;

	@NonNull
	private String login;
	
	@NonNull
	private String senha;
	
	private boolean ativo;
	
	@OneToMany(mappedBy="usuario", cascade = CascadeType.ALL)
	private List<Banca> banca;
	
}
