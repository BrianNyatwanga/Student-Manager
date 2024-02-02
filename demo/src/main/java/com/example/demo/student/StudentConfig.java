package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import javax.servlet.http.HttpServletRequest;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student Brian = new Student(
                    "Brayo Quentin",
                    "brian.nyatwanga@gmail.com",
                    LocalDate.of(2000, MARCH, 2)
            );
            Student Alex = new Student(
                    "Pretty",
                    "pretty@gmail.com",
                    LocalDate.of(2004, JANUARY, 2)
            );
            repository.saveAll(
                    List.of(Brian, Alex)
            );
        };
    }


}
