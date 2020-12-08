package br.com.coyottebm.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "banca")
@Getter @Setter
public class Banca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Double valorInicial;
	
	@NotNull
	private Double valorAtual;
	
	@NotNull
	private Double valorCreditoAposta;
	
	@NotNull
    private LocalDate dataCriacao;

	

}
