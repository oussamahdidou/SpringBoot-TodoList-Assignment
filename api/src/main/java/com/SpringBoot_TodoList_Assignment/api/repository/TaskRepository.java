package com.SpringBoot_TodoList_Assignment.api.repository;

import com.SpringBoot_TodoList_Assignment.api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
