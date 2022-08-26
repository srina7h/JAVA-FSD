package com.nseit.Spring_Boot_Todo;

import com.nseit.Spring_Boot_Todo.Service.TodoService;
import com.nseit.Spring_Boot_Todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTodoApplication implements CommandLineRunner {

    @Autowired
    private TodoService todoService;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootTodoApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        Todo todo = new Todo(1,"hii",false);
        Todo todoOne = new Todo(2,"hello",false);
        Todo todoTwo = new Todo(3,"hai",false);
        todoService.addTodo(todo);
        todoService.addTodo(todoOne);
        todoService.addTodo(todoTwo);

        todoService.viewTodo();
        todoService.updateTodo(1);
        todoService.removeTodo(2);
        todoService.viewTodo();


    }
}
