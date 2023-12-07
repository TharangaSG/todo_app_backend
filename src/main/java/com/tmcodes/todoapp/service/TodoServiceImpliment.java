package com.tmcodes.todoapp.service;
import com.tmcodes.todoapp.model.Todo;
import com.tmcodes.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class TodoServiceImpliment implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Iterable<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<Todo> getCompletedTodos() {
        return todoRepository.findAllByCompletedOnNotNull();
    }



}
