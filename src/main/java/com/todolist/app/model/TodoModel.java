package com.todolist.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * 
 * @author mdanescu
 *
 *         JPA starter to talk to MySQL database
 */

@Entity
@Table(name = "todos")
public class TodoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;
	@Size(max = 30, message = "Please enter maximum 30 Characters...")
	private String taskName;

	@Size(min = 10, message = "Please enter at least 10 Characters...")
	private String description;

	private Date deadline;

	public TodoModel() {
		super();
	}

	public TodoModel(String userName, String description, Date deadline) {
		super();
		this.userName = userName;
		this.description = description;
		this.deadline = deadline;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}
