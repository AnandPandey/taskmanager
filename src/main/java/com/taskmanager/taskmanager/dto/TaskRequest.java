package com.taskmanager.taskmanager.dto;

import com.taskmanager.taskmanager.model.enums.TaskStatus;
import lombok.Data;
import java.time.LocalDate;

@Data
public class TaskRequest {
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDate dueDate;
    private Long projectId;
    private Long assignedToId;
}