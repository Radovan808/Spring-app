package cz.rado.springapp.service;

import cz.rado.springapp.model.Employee;
import cz.rado.springapp.model.Todo;
import cz.rado.springapp.model.TodoList;

import java.util.List;

public interface RestApiService {
    Employee getEmployee(Long id);
    Todo getTodo(Long id);
    List<Todo> getTodos();
    TodoList getTodoList();
}
