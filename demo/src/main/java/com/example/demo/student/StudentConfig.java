package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student Lali = new Student(
                    "lali@gmail.com",
                    "Lali",
                    LocalDate.of(2002, Month.JULY, 5)
            );

            Student Dikzsum = new Student(
                    "Gyurko@gmail.com",
                    "Dikzsum",
                    LocalDate.of(2004, Month.JULY, 5)
            );

            repository.saveAll(
                    List.of(Lali,Dikzsum)
            );
        };
    }
}
