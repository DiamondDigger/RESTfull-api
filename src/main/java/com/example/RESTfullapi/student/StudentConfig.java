package com.example.RESTfullapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                            "John",
                            "jonhBo@gmail.com",
                            LocalDate.of(2001, Month.AUGUST, 5),
                            18
            );
            Student ashly = new Student(
                    "Ashly",
                    "ashlyV@gmail.com",
                    LocalDate.of(2006, Month.AUGUST, 5),
                    18
            );

            repository.saveAll(List.of(
                    john, ashly
            ));
        };
    }
}
