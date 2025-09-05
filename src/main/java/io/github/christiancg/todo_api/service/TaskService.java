package io.github.christiancg.todo_api.service;

import io.github.christiancg.todo_api.domain.model.Status;
import io.github.christiancg.todo_api.domain.model.Task;
import io.github.christiancg.todo_api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {

        if (task.getStatus() == null) {
            task.setStatus(Status.PENDING);
        }

        return taskRepository.save(task);
    }

    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task updateTask(Long id, Task task) {
        Task taskToUpdate =  taskRepository.findById(id).orElse(null);

        if (taskToUpdate == null) {
            return null;
        }

        taskToUpdate.setTitle(task.getTitle());
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setDueDate(task.getDueDate());
        taskToUpdate.setStatus(task.getStatus());
        taskToUpdate.setPriority(task.isPriority());

        if (task.getStatus() == null) {
            taskToUpdate.setStatus(Status.PENDING);
        }


        return taskRepository.save(taskToUpdate);
    }

    public Task deleteById(Long id) {
       Task taskToDelete =  taskRepository.findById(id).orElse(null);

       if (taskToDelete == null) {
           return null;
       }

       taskRepository.delete(taskToDelete);

       return taskToDelete;
    }

}
