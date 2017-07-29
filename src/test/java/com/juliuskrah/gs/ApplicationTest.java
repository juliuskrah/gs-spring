package com.juliuskrah.gs;

import org.junit.Test;
import org.jvnet.hk2.testing.junit.HK2Runner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;

public class ApplicationTest extends HK2Runner {
    @Inject
    private MessageService messageService;

    @Test
    public void test() {
        String message = messageService.getMessage();

        assertThat(message, is(notNullValue()));
        assertThat(message, is(equalTo("Hello World!")));
    }
    
}