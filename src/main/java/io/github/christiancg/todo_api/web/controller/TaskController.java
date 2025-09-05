package io.github.christiancg.todo_api.web.controller;

import io.github.christiancg.todo_api.domain.model.Task;
import io.github.christiancg.todo_api.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody @Valid Task task) {
        return  taskService.createTask(task);
    }

    @GetMapping("/tasks")
    public Iterable<Task> findAllTasks() {
        return taskService.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Task findTaskById(@PathVariable Long id) {
        return taskService.findById(id);
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody @Valid Task task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/tasks/{id}")
    public Task deleteTaskById(@PathVariable Long id) {
        return taskService.deleteById(id);
    }
}
