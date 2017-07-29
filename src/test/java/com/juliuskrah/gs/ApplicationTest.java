package com.juliuskrah.gs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { Application.class })
public class ApplicationTest {
    @Autowired
    private MessageService messageService;

    @Test
    public void test() {
        String message = messageService.getMessage();

        assertThat(message, is(notNullValue()));
        assertThat(message, is(equalTo("Hello World!")));
    }
    
}