package com.Tasks.TodoList;

public class TaskTitle {

    private final String ID;
    private final String title;
    private final String description;
    private String progress;

    public TaskTitle(String taskID, String title, String description, String progress) {
        this.ID = taskID;
        this.title = title;
        this.description = description;
        this.progress = progress;

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getID() {
        return ID;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }


    public boolean isInProgress() {
        return "In Progress".equals(getProgress());
    }


    public boolean isCompleted() {
        return "Completed".equals(getProgress());
    }

    public boolean isTODO() {
        return "TODO".equals(getProgress());
    }


}
