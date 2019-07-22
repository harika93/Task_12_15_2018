package com.lkb;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TodoBusinessImplStubTest {
    @Test
    public void test() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusiness.retriveTodoRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }
}