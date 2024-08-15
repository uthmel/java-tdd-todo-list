package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<Task> tasks;

    public TodoList(){
        this.tasks = new ArrayList<>();
    }


    public boolean addTask(String taskDescription){
        for(Task task : tasks){
            if (task.getDescription().equalsIgnoreCase(taskDescription)){
                return false;
            }
        }

        Task newTask = new Task(taskDescription);
        tasks.add(newTask);
        return true;
    }

}


class Task {
    private final String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
