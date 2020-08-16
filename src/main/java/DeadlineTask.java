package main.java;

public class DeadlineTask extends Task {
    private String date;
    DeadlineTask(String taskName, String date) {
        super(taskName);
        this.date = date;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + date + ")";
    }
}
