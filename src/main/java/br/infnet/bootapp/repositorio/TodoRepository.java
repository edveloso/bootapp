package br.infnet.bootapp.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.infnet.bootapp.modelo.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {

}
