package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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


}
