package io.github.christiancg.todo_api.repository;

import io.github.christiancg.todo_api.domain.model.Status;
import io.github.christiancg.todo_api.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Status status);
    List<Task> findByTitleContaining(String keyword);
    List<Task> findByDueDateBefore(LocalDate date);


}
