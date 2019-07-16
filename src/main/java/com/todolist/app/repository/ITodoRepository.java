package com.todolist.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.app.model.TodoModel;

/**
 * 
 * @author mdanescu
 *
 */
public interface ITodoRepository extends JpaRepository<TodoModel, Long> {
	List < TodoModel > findByUserName(String user);
}
