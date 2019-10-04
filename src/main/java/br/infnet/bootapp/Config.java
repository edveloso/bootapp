package br.infnet.bootapp;

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
			repo.save(new Usuario("joao", "joao@bol.com"));
			repo.save(new Usuario("maria", "m@bol.com"));
			repo.save(new Usuario("pedro", "p@bol.com"));
			repo.save(new Usuario("renata", "r@bol.com"));
			repo.save(new Usuario("afonso", "a@bol.com"));
			
		};
	}
	

}
