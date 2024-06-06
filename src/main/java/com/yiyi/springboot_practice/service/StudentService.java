package com.yiyi.springboot_practice.service;

import com.yiyi.springboot_practice.dao.Student;
import com.yiyi.springboot_practice.dto.StudentDTO;

public interface StudentService {

    public StudentDTO getStudentById(long id);

    Long addNewStudent(StudentDTO studentDTO);

    void deleteStudentById(long id);

    StudentDTO updateStudentById(long id, String name, String email);
}
