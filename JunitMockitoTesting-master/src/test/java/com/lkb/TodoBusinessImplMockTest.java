package com.lkb;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {
    @Test
    public void testReceiveTodoRelatedSpringUsingMock() {
        TodoService todoServiceStubMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring mvc", "learn Spring", "Learn to dance");
        when(todoServiceStubMock.retriveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStubMock);

        List<String> filteredTodos = todoBusiness.retriveTodoRelatedToSpring("Dummy");
        assertEquals(2, filteredTodos.size());
    }
}