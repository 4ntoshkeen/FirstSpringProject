package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class ProjectConfigure {
    @Primary
    @Bean
    Person person() {
    Person p = new Person();
    p.setName("Peter");
    return p;
    }

    @Bean
    Integer ten() {
        return 10;
    }
}