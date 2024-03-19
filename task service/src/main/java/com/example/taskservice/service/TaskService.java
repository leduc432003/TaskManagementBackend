package com.example.taskservice.service;

import com.example.taskservice.model.Task;
import com.example.taskservice.model.TaskStatus;

import java.util.List;

public interface TaskService {
    Task createTask(Task task, String requestRole) throws Exception;
    Task getTaskById(Long id) throws Exception;
    List<Task> getAllTasks(TaskStatus status);
    Task updateTask(Long id, Task updateTask, Long userId) throws Exception;
    void deleteTask(Long id) throws Exception;
    Task assignedToUser(Long userId, Long taskId) throws Exception;
    List<Task> assignedUsersTask(Long userId, TaskStatus status);
    Task completeTask(Long taskId) throws Exception;
}
