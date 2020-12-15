package br.com.coyottebm.resource.token;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coyottebm.config.property.CoyotteBetManagerApiProperty;

@RestController
@RequestMapping("/token")
public class TokenResource {
	
	@Autowired
	private CoyotteBetManagerApiProperty property;

	@DeleteMapping
	public void removerToken(HttpServletRequest request, HttpServletResponse response) {
		Cookie cookie = new Cookie("refreshToken", null);
		
		cookie.setHttpOnly(true);
		cookie.setSecure(property.isHabilitaHttps());
		cookie.setPath(request.getContextPath()+"/oauth/token");
		cookie.setMaxAge(0);
		
		response.addCookie(cookie);
		response.setStatus(HttpStatus.NO_CONTENT.value());
	}
}
