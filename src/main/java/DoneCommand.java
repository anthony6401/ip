package main.java;

import java.io.IOException;

public class DoneCommand extends Command {
    private int taskNumber;

    public DoneCommand(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        if (taskNumber < 1 || taskNumber > tasks.size()) {
            throw new InvalidTaskNumberException();
        } else {
            Task task = tasks.getTask(taskNumber - 1);
            task.setStatusToDone();
            storage.changeTaskInFile(taskNumber);
            String message = ui.doneSuccess(task);
            ui.sendMessage(message);
        }
    }
}
