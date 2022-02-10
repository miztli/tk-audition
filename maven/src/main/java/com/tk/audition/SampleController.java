package com.tk.audition;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class SampleController
{

    @Resource
    private SampleService service;

    public String greetings() {
        return service.greetings();
    }
}
