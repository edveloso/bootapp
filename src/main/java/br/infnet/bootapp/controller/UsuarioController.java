package br.infnet.bootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.infnet.bootapp.modelo.Usuario;
import br.infnet.bootapp.repositorio.UsuarioRepository;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	
	@GetMapping("/users")
	@ResponseBody
	public List<Usuario> getAllUser(){
		Iterable<Usuario> findAll = usuarioRepository.findAll();
		return (List<Usuario>) findAll;
	}
	
	
	public UsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	
	
}
