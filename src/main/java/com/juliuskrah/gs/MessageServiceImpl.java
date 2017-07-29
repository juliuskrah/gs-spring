package com.juliuskrah.gs;

import org.jvnet.hk2.annotations.Service;

@Service
public class MessageServiceImpl implements MessageService {
    
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}