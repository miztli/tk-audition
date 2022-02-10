package com.tk.audition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SampleControllerTest
{

    @Mock
    private SampleService service;

    @InjectMocks
    private SampleController controller;

    @Test
    void shouldGetGreetings() {
        // given
        when(service.greetings()).thenCallRealMethod();

        // when
        final String greetings = controller.greetings();

        // then
        assertEquals("hello world!", greetings);
    }
}
