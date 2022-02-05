package com.javamultiplex.service;

import com.javamultiplex.model.Student;
import com.javamultiplex.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Rohit Agarwal on 30/01/22 11:13 PM
 * @copyright www.javamultiplex.com
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
