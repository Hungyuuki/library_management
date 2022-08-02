package com.pmhung2.library_management.Reposiroty;

import com.pmhung2.library_management.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
