package com.lkb;



import java.util.ArrayList;
import java.util.List;
// TodoBusinessImpl SUT
// TodoService is Dependency
public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retriveTodoRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos =todoService.retriveTodos(user);
        for(String todo: todos){
            if(todo.contains("Spring")){
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
