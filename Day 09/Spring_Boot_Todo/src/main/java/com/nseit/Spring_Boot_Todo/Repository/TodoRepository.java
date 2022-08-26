package com.nseit.Spring_Boot_Todo.Repository;

import com.nseit.Spring_Boot_Todo.model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Repository
public class TodoRepository {
    private ArrayList<Todo> todos = new ArrayList<>();
}
