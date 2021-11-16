package com.example.Docker.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoController 
{
 
    @RequestMapping(method = RequestMethod.GET)
    public String getAllTodos()
    {
        return "Hello world";
    }
}
