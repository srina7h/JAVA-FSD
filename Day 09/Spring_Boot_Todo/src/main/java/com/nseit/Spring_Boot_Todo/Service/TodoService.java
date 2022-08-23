package com.nseit.Spring_Boot_Todo.Service;

import com.nseit.Spring_Boot_Todo.Repository.TodoRepository;
import com.nseit.Spring_Boot_Todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TodoService {
private  TodoRepository todoRepository;
    public void addTodo(Todo todo) {
        ArrayList<Todo> todos =todoRepository.getTodos();
          todos.add(todo);


    }

    public void viewTodo() {
        for ((Todo todo : todoRepository.getTodos())){

        }

    }

    public void updateTodo(int todo) {

    }

    public void removeTodo(int todo) {

    }

}
