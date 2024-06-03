package com.students.system.service;

import com.students.system.model.Student;
import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

