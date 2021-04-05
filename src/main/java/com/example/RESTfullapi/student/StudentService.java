package com.example.RESTfullapi.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return  List.of(
                new Student(1L,
                        "John",
                        "jonhBo@gmail.com",
                        LocalDate.of(2001, Month.AUGUST, 5),
                        18
                )
        );
    }
}
