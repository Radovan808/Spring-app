package cz.rado.springapp.service.impl;

import cz.rado.springapp.model.Employee;
import cz.rado.springapp.model.Todo;
import cz.rado.springapp.model.TodoList;
import cz.rado.springapp.service.RestApiService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RestApiServiceImpl implements RestApiService {

    RestTemplate restTemplate;

    public RestApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Employee getEmployee(Long id) {
        Employee employee =
                restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/8961",
                        Employee.class);

        return employee;
    }

    @Override
    public Todo getTodo(Long id) {
        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1",
                Todo.class);
        return todo;
    }

    @Override
    public List<Todo> getTodos() {
        ResponseEntity<List<Todo>> responseEntity = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>() {
                }
        );

        List<Todo> todos = responseEntity.getBody();
        return todos;
    }

    @Override
    public TodoList getTodoList() {
        TodoList todoList = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos",
                TodoList.class);
        return todoList;
    }
}
