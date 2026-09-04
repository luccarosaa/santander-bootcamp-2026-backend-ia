package dio.taskmanager.application.input;

import dio.taskmanager.domain.TaskStatus;

import java.util.Optional;

public record UptadeTaskInput(Optional<String> title,
                              Optional<String> description,
                              Optional<TaskStatus> status) {

}
