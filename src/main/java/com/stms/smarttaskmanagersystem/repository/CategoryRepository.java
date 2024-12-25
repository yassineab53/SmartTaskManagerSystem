package com.stms.smarttaskmanagersystem.repository;


import com.stms.smarttaskmanagersystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
