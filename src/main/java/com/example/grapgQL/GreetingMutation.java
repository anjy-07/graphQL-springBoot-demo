package com.example.grapgQL;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class GreetingMutation implements GraphQLMutationResolver {

    @Autowired
    private GreetingRepository greetingRepository;

    public Greeting newGreeting(String message) {
        Greeting greeting = new Greeting();
        greeting.setMessage(message);

        return greetingRepository.save(greeting);
    }
}