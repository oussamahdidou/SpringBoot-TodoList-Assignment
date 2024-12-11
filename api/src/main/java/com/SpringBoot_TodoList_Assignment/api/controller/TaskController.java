package com.SpringBoot_TodoList_Assignment.api.controller;


import com.SpringBoot_TodoList_Assignment.api.dto.TaskCreateDTO;
import com.SpringBoot_TodoList_Assignment.api.dto.TaskUpdateDto;
import com.SpringBoot_TodoList_Assignment.api.model.Task;
import com.SpringBoot_TodoList_Assignment.api.service.TaskService;
import com.SpringBoot_TodoList_Assignment.api.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.GetAllTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = taskService.GetTaskById(id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody TaskCreateDTO taskCreateDTO) {
        Task newTask = taskService.AddTask(taskCreateDTO);
        return new ResponseEntity<>(newTask, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody TaskUpdateDto taskUpdateDto) {
        Task updatedTask = taskService.UpdateTask(id, taskUpdateDto);
        return new ResponseEntity<>(updatedTask, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.DeleteTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

