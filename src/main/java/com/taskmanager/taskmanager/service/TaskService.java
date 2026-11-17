package com.taskmanager.taskmanager.service;

import java.util.List;

import com.taskmanager.taskmanager.dto.TaskRequest;
import com.taskmanager.taskmanager.entity.Task;

public interface TaskService {
	Task createTask(TaskRequest request);

	List<Task> getAllTasks();

	Task getTaskById(Long id);

	Task updateTask(Long id, TaskRequest request);

	void deleteTask(Long id);
}
