package com.bank.banking.api.Controller;

import com.bank.banking.api.dto.TodoRequest;
import com.bank.banking.api.dto.TodoResponse;
import com.bank.banking.api.service.TodoService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private TodoService todoService;


    @PostMapping("post/user")
    public ResponseEntity<Object> createtodouser(@RequestBody TodoRequest todoRequest){
        log.info("Create User with Request: {}", todoRequest);
        todoService.create(todoRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping("up/user/{id}")
    public ResponseEntity<Object> updatetodouser(@RequestBody TodoRequest todoRequest,@PathVariable Long id){
        log.info("Update User with Request: {}",id, todoRequest);
        todoService.update(id, todoRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("del/user{id}")
    public ResponseEntity<?> deletetodouser(@PathVariable String id){
        log.info("Delete User with Request: {}", id);
        todoService.delete(Long.parseLong(id));
        return ResponseEntity.ok().build();
    }

    @GetMapping("get/user/{ids}")
    public ResponseEntity<TodoResponse> getById(@PathVariable String id){
        log.info("Get User with Request: {}", id);
        TodoResponse todoResponse = todoService.getById(Long.parseLong(id));
        if(todoResponse == null ){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(todoResponse);
    }

    @GetMapping("get/user")
    public ResponseEntity<List<TodoResponse>> getAll(){
        log.info("Get All User");
        List<TodoResponse> todoResponse = todoService.getAll();
        return ResponseEntity.ok(todoResponse);

    }







}
