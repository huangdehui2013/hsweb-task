package org.hswebframework.task.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hswebframework.task.Task;

@AllArgsConstructor
@Getter
public class TaskFailedEvent {
    private Task task;

    private Throwable cause;

}
