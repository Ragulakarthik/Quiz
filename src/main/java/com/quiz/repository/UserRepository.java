package com.quiz.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entity.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long> {

}