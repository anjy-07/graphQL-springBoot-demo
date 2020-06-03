package com.example.grapgQL;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class GreetingQuery implements GraphQLQueryResolver {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting getGreeting(String id) {
        return greetingRepository.find(id);
    }
}