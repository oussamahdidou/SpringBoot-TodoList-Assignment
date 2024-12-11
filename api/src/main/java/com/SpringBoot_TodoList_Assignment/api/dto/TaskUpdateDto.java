package com.SpringBoot_TodoList_Assignment.api.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskUpdateDto {

    @NotNull(message = "Title is required")
    @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters")
    private String title;

    @Size(max = 500, message = "Description can be up to 500 characters")
    private String description;

    @NotNull(message = "Completion status is required")
    private Boolean completed;

    @FutureOrPresent(message = "Due date must be in the future or present")
    private LocalDateTime dueDate;
}
