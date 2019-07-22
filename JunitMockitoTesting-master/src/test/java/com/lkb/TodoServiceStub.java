package com.lkb;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
    public List<String> retriveTodos(String user) {
        return Arrays.asList("Learn Spring mvc", "learn Spring", "Learn to dance");
    }
}
