package com.taskmanager.taskmanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.taskmanager.dto.TaskRequest;
import com.taskmanager.taskmanager.entity.Task;
import com.taskmanager.taskmanager.service.TaskService;

import jakarta.validation.Valid;

@RestController

@RequestMapping("/api/tasks")

@CrossOrigin(origins = "http://localhost:5173")

public class TaskController {

	private final TaskService service;

	public TaskController(TaskService service) {

		this.service = service;

	}

	// CREATE

	@PostMapping

	public Task createTask(

			@Valid @RequestBody TaskRequest request) {

		return service.createTask(request);

	}

	// READ ALL

	@GetMapping

	public List<Task> getAllTasks() {

		return service.getAllTasks();

	}

	// READ BY ID

	@GetMapping("/{id}")

	public Task getTaskById(@PathVariable Long id) {

		return service.getTaskById(id);

	}

	// UPDATE

	@PutMapping("/{id}")

	public Task updateTask(

			@PathVariable Long id,

			@Valid @RequestBody TaskRequest request) {

		return service.updateTask(id, request);

	}

	// DELETE

	@DeleteMapping("/{id}")

	public void deleteTask(@PathVariable Long id) {

		service.deleteTask(id);

	}

}
