package br.infnet.bootapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.infnet.bootapp.modelo.Todo;
import br.infnet.bootapp.repositorio.TodoRepository;

@Controller
public class TodoController {

	@Autowired
	private TodoRepository todoRepository;

	@RequestMapping("/todos/form")
	public String getForm(Model model) {
		Optional<Todo> todo = todoRepository.findById(1);
		model.addAttribute("todo", todo.get());
		return "todos/form";
	}
	
	
	public TodoRepository getTodoRepository() {
		return todoRepository;
	}

	public void setTodoRepository(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	
	
	
}
