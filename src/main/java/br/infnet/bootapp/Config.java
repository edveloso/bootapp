package br.infnet.bootapp;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.infnet.bootapp.modelo.Usuario;
import br.infnet.bootapp.repositorio.UsuarioRepository;

@SpringBootApplication
public class Config {
	
	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}
	
	
	@Bean
	public CommandLineRunner init(UsuarioRepository repo) {
		return args -> {
			List<Usuario> findByNome = repo.findByNome("joao");
			for (Usuario u : findByNome) {
				System.out.println(u.getNome() );
			}
			
			Usuario email = repo.findByEmail("joao@bol.com");
			System.out.println(email.getNome());
		};
	}
	

}
