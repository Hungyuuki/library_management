package com.pmhung2.library_management.Reposiroty;

import com.pmhung2.library_management.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IStudentRepository extends JpaRepository <Student, Long> {
}
