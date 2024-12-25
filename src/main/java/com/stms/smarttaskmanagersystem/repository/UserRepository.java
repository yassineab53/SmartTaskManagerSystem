package com.stms.smarttaskmanagersystem.repository;


import com.stms.smarttaskmanagersystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
