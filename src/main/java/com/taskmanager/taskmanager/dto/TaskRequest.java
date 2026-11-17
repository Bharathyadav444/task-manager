package com.taskmanager.taskmanager.dto;

import com.taskmanager.taskmanager.entity.Priority;

import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;

public record TaskRequest(

    @NotBlank(message = "Title is required")

    String title,

    String description,

    @NotNull(message = "Priority is required")

    Priority priority,

    Boolean completed

) {}
 
