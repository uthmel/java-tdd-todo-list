package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TodoListTest {

    @Test
    public void testAddTaskIfNotExist(){
        TodoList todolist = new TodoList();
        boolean result1 = todolist.addTask("Buy groceries");
        Assertions.assertTrue(result1, "The task should be added successfully");

    }

    @Test
    public void testAddTaskIfExists() {
        TodoList todolist = new TodoList();
        todolist.addTask("Buy groceries");
        boolean result2 = todolist.addTask("Buy groceries");
        Assertions.assertFalse(result2, "The task should not be added successfully, since it already exists");

    }

    @Test
    public void testAddSecondTask() {
        TodoList todoList = new TodoList();
        Assertions.assertTrue(todoList.addTask("Buy Clothes"));
    }

    @Test
    public void testGetAllTasksNumber() {
        TodoList todoList = new TodoList();
        todoList.addTask("Buy Groceries");
        todoList.addTask("Buy Clothes");

        List<Task> tasks = todoList.getAllTasks();
        Assertions.assertEquals(2,tasks.size());


    }


    @Test
    public void testGetAllTasksStringEqual() {
        TodoList todoList = new TodoList();
        todoList.addTask("Buy Groceries");

        List<Task> tasks = todoList.getAllTasks();
        Assertions.assertEquals(tasks, "Buy Groceries");


    }


}
