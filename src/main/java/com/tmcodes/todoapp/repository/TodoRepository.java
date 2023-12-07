package com.tmcodes.todoapp.repository;

import java.util.List;

import com.tmcodes.todoapp.model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByCompletedOnNotNull();
}