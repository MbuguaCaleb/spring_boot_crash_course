package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Means that it can be Injected
//It converts it into a SpringBean
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Caleb",
                        "mbuguacaleb30@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )
        );
    }
}
