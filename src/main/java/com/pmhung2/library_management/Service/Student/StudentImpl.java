package com.pmhung2.library_management.Service.Student;

import com.pmhung2.library_management.Entity.Student;
import com.pmhung2.library_management.Reposiroty.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentImpl implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;
    @Override
    public Iterable findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void removeById(Long id) {
        studentRepository.deleteById(id);
    }
}
