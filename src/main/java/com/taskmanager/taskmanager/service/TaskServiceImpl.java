package com.taskmanager.taskmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taskmanager.taskmanager.dto.TaskRequest;
import com.taskmanager.taskmanager.entity.Task;
import com.taskmanager.taskmanager.repository.TaskRepository;

@Service

public class TaskServiceImpl implements TaskService {

	private final TaskRepository repository;

	public TaskServiceImpl(TaskRepository repository) {

		this.repository = repository;

	}

	@Override

	public Task createTask(TaskRequest request) {

		Task task = new Task();

		task.setTitle(request.title());

		task.setDescription(request.description());

		task.setPriority(request.priority());

		task.setCompleted(

				Boolean.TRUE.equals(request.completed())

		);

		return repository.save(task);

	}

	@Override

	public List<Task> getAllTasks() {

		return repository.findAll();

	}

	@Override

	public Task getTaskById(Long id) {

		return repository.findById(id)

				.orElseThrow(() ->

				new RuntimeException("Task not found: " + id)

				);

	}

	@Override

	public Task updateTask(Long id, TaskRequest request) {

		Task task = getTaskById(id);

		task.setTitle(request.title());

		task.setDescription(request.description());

		task.setPriority(request.priority());

		if (request.completed() != null) {

			task.setCompleted(request.completed());

		}

		return repository.save(task);

	}

	@Override

	public void deleteTask(Long id) {

		if (!repository.existsById(id)) {

			throw new RuntimeException("Task not found: " + id);

		}

		repository.deleteById(id);

	}

}
