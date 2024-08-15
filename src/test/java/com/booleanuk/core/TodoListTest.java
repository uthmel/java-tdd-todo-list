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
        Assertions.assertEquals("Buy Groceries", tasks.get(0).getDescription(), "The tasks matches'");
        Assertions.assertNotEquals("Buy Clothes", tasks.get(0).getDescription(), "The task description should be 'Buy Groceries'");


    }

    @Test
    public void testChangeTaskToCompleteTrue() {

        TodoList todoList = new TodoList();
        todoList.addTask("Buy Groceries");
        List<Task> tasks = todoList.getAllTasks();
        Task task = tasks.getFirst();
        task.setComplete(true);
        Assertions.assertEquals(task.isComplete(), true);


    }

    @Test
    public void testChangeTaskToInComplete(){
        TodoList todoList = new TodoList();
        todoList.addTask("Buy Groceries");
        List<Task> tasks = todoList.getAllTasks();
        Task task = tasks.getFirst();
        task.setComplete(false);
        Assertions.assertEquals(task.isComplete(), false);


    }


    @Test
    public void testSearchTaskFound() {
        TodoList todoList = new TodoList();
        todoList.addTask("Buy Groceries");
        String result = todoList.searchTask("Buy Groceries");
        Assertions.assertEquals("The task was found", result, "The task should be found");
    }


    @Test
    public void testSearchTaskNotFound() {
        TodoList todoList = new TodoList();
        todoList.addTask("Walk with Dog");
        String result = todoList.searchTask("Buy Groceries");
        Assertions.assertEquals("The task was not found", result, "The task does not exist");
    }


    @Test
    public void testRemoveTaskFromList() {
        TodoList todoList = new TodoList();
        todoList.addTask("Walk with Dog");
        todoList.addTask("Buy groceries");

        List<Task> tasks = todoList.getAllTasks();

        todoList.removeTask("Walk with Dog");

        tasks.getFirst().equals("Buy groceries");


    }


}
