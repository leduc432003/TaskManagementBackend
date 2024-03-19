package com.example.taskservice.controller;

import com.example.taskservice.model.Task;
import com.example.taskservice.model.TaskStatus;
import com.example.taskservice.model.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/tasks")
    public ResponseEntity<String> getAssignedUserTask() throws Exception {

        return new ResponseEntity<>("welcome to task service", HttpStatus.OK);
    }
}
