package br.infnet.bootapp.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.bootapp.modelo.Usuario;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
  
	List<Usuario> findByNome(String nome);
	Usuario findByEmail(String email);
	
}
