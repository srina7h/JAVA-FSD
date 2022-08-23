package com.nseit.Spring_Boot_Todo.Repository;

import com.nseit.Spring_Boot_Todo.model.Todo;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class TodoRepository {
    private ArrayList<Todo> todos = new ArrayList<>();
}
