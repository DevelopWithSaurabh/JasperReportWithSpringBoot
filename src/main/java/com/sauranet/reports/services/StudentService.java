package com.sauranet.reports.services;

import com.sauranet.reports.entities.Student;
import com.sauranet.reports.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer rollNumber) {
        return studentRepository.findById(rollNumber)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + rollNumber));
    }
}
