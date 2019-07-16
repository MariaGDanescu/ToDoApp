package com.todolist.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.todolist.app.model.TodoModel;

public interface ITodoService {
	List < TodoModel > getTodosByUser(String user);

    Optional < TodoModel > getTodoById(long id);

    void updateTodo(TodoModel todo);

    void addTodo(String name, String desc, Date deadline);

    void deleteTodo(long id);

    void saveTodo(TodoModel todo);
}
