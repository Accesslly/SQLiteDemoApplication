package com.example.sqlitedemoapplication.dao;

import com.example.sqlitedemoapplication.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAllStudent();
    void insert(Student student);
    void updata(Student student);
    void delete(String studentName);
}
