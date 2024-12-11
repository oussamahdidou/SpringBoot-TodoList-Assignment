package com.SpringBoot_TodoList_Assignment.api.service;

import com.SpringBoot_TodoList_Assignment.api.dto.TaskCreateDTO;
import com.SpringBoot_TodoList_Assignment.api.dto.TaskUpdateDto;
import com.SpringBoot_TodoList_Assignment.api.model.Task;
import com.SpringBoot_TodoList_Assignment.api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService{
    private  final TaskRepository taskRepository;
    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> GetAllTasks() {
       return  taskRepository.findAll();
    }

    @Override
    public Task GetTaskById(Long Id) {
        return  taskRepository.findById(Id).orElseThrow();
    }

    @Override
    public Task AddTask(TaskCreateDTO taskCreateDTO) {
        Task task = new Task();
        task.setTitle(taskCreateDTO.getTitle());
        task.setDescription(taskCreateDTO.getDescription());
        task.setDueDate(taskCreateDTO.getDueDate());
        return  taskRepository.save(task);
    }

    @Override
    public Task UpdateTask(Long Id, TaskUpdateDto taskUpdateDto) {
        Task task = taskRepository.findById(Id).orElseThrow();
        task.setTitle(taskUpdateDto.getTitle());
        task.setDescription(taskUpdateDto.getDescription());
        task.setDueDate(taskUpdateDto.getDueDate());
        task.setCompleted(taskUpdateDto.getCompleted());
        return  taskRepository.save(task);
    }

    @Override
    public Task DeleteTask(Long Id) {
        Task task = taskRepository.findById(Id).orElseThrow();
        taskRepository.delete(task);
        return task;
    }
}
