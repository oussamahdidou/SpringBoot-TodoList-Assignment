package com.SpringBoot_TodoList_Assignment.api.service;

import com.SpringBoot_TodoList_Assignment.api.dto.TaskCreateDTO;
import com.SpringBoot_TodoList_Assignment.api.dto.TaskUpdateDto;
import com.SpringBoot_TodoList_Assignment.api.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> GetAllTasks();
    Task GetTaskById(Long Id);
    Task AddTask(TaskCreateDTO taskCreateDTO);
    Task UpdateTask(Long Id, TaskUpdateDto taskUpdateDto);
    Task DeleteTask(Long Id);

}
