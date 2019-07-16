package com.todolist.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.todolist.app.model.TodoModel;
import com.todolist.app.repository.ITodoRepository;

@Service
public class TodoService implements ITodoService  {

	@Autowired
	private ITodoRepository todoRepository;

	public List<TodoModel> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	public Optional<TodoModel> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	public void updateTodo(TodoModel todo) {
		todoRepository.save(todo);
	}

	public void deleteTodo(long id) {
		Optional<TodoModel> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	public void saveTodo(TodoModel todo) {
		todoRepository.save(todo);
	}

	public void addTodo(String name, String desc, Date deadline) {
		todoRepository.save(new TodoModel(name, desc, deadline));

	}

}
