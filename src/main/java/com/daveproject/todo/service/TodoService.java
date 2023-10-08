package com.daveproject.todo.service;

import com.daveproject.todo.dto.TodoDto;

public interface TodoService {

    TodoDto addTodo(TodoDto todoDto);

    TodoDto getTodo(Long id);
}
