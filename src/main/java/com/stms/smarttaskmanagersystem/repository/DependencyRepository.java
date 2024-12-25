package com.stms.smarttaskmanagersystem.repository;


import com.stms.smarttaskmanagersystem.model.Dependency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependencyRepository extends JpaRepository<Dependency, Integer> {
}
