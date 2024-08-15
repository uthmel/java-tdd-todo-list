package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    @Test
    public void testAddTask(){
        TodoList todolist = new TodoList();
        boolean result1 = todolist.addTask("Buy groceries");
        Assertions.assertTrue(result1, "The task should be added sucessfully");
    }
}
