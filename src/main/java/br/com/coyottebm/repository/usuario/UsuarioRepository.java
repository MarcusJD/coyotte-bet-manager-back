package br.com.coyottebm.repository.usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.coyottebm.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByLogin(String login);
}
