package com.tmcodes.todoapp.service;
import com.tmcodes.todoapp.model.Todo;

import java.util.List;

public interface TodoService {
    Iterable<Todo> getAllTodos();
    Todo addTodo(Todo todo);
    void deleteTodo(Long id);
    List<Todo> getCompletedTodos();

}
