package com.bank.banking.api.service.impl;

import com.bank.banking.api.dto.TodoRequest;
import com.bank.banking.api.dto.TodoResponse;
import com.bank.banking.api.model.TodoUser;
import com.bank.banking.api.repository.TodoRepository;
import com.bank.banking.api.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class TodoserviceImpl implements TodoService  {

    private final TodoRepository todoRepository;

    public TodoserviceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }




    @Override
    public void create(TodoRequest todoRequest) {
        TodoUser todoUser = new TodoUser();
        todoUser.setUsername(todoRequest.getUsername());
        todoUser.setPassword(todoRequest.getPassword());
        todoUser.setMoney(todoRequest.getMoney());
        todoUser.setCompleted(false);
        todoUser.setCreated(new Date());
        todoRepository.save(todoUser);
    }

    @Override
    public void update(long id, TodoRequest todoRequest) {
        Optional<TodoUser> todoUser = todoRepository.findById(id);
        if (todoUser.isEmpty()){
            log.info("User with id {}",id);
            return;
        }
        TodoUser todoUser1 = todoUser.get();
        todoUser1.setUsername(todoRequest.getUsername());
        todoUser1.setPassword(todoRequest.getPassword());
        todoUser1.setMoney(todoRequest.getMoney());
        todoUser1.setCompleted(false);
        todoUser1.setUpdated(new Date());

        todoRepository.save(todoUser1);
    }

    @Override
    public void delete(long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public TodoResponse getById(long id) {
        TodoResponse todoResponse = new TodoResponse();

        Optional<TodoUser> todoUser = todoRepository.findById(id);
        if (todoUser.isEmpty()){
            log.info("Get User with id {} not found!",id);
            return todoResponse;
        }
        todoResponse.setId(todoUser.get().getId());
        todoResponse.setUsername(todoUser.get().getUsername());
        todoResponse.setPassword(todoUser.get().getPassword());
        todoResponse.setMoney(todoUser.get().getMoney());
        todoResponse.setCompleted(todoUser.get().getCompleted());
        return null;
    }


    @Override
    public List<TodoResponse> getAll() {
        List<TodoResponse> todoResponse1 = new ArrayList<>();

        List<TodoUser> todoUser = todoRepository.findAll();
        if (todoUser.isEmpty()){
            log.info("User no found");
            return todoResponse1;
        }
        for (TodoUser user : todoUser) {
            TodoResponse todoResponse = new TodoResponse();

            todoResponse.setId(user.getId());
            todoResponse.setUsername(user.getUsername());
            todoResponse.setPassword(user.getPassword());
            todoResponse.setMoney(user.getMoney());
            todoResponse.setCompleted(user.getCompleted());
            todoResponse1.add(todoResponse);

        }

        return todoResponse1;
    }
}
