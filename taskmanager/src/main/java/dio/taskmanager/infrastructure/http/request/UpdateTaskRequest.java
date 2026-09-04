package dio.taskmanager.infrastructure.http.request;

import dio.taskmanager.application.input.UptadeTaskInput;
import dio.taskmanager.domain.TaskStatus;

import java.util.Optional;

public record UpdateTaskRequest(
        Optional<String> title,
        Optional<String> description,
        Optional<String> status
) {
    public UptadeTaskInput toInput() {
        return new UptadeTaskInput(title, description, status.map(TaskStatus::valueOf));
    }
}
