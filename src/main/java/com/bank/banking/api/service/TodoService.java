package com.bank.banking.api.service;

import com.bank.banking.api.dto.TodoRequest;
import com.bank.banking.api.dto.TodoResponse;

import java.util.List;

public interface TodoService {
    void create(TodoRequest todoRequest);
    void update(long id,TodoRequest todoRequest);
    void delete(long id);
    TodoResponse getById(long id);
    List<TodoResponse> getAll();
}
