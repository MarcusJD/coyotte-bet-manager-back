package br.com.coyottebm.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.coyottebm.model.Usuario;
import br.com.coyottebm.repository.usuario.UsuarioRepository;

/**
 * Valida e carrega o usuário.
 */
@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;                       
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		
		Optional<Usuario> usuarioOptional = usuarioRepository.findByLogin(login);		
		
		usuarioOptional.orElseThrow(()-> new UsernameNotFoundException("Usuário e/ou senha não encontrado."));
		
		return new User(login, 
				        usuarioOptional.get().getSenha(),
				        (Collection<? extends GrantedAuthority>) new ArrayList<GrantedAuthority>()); //Permissões
	}

}
