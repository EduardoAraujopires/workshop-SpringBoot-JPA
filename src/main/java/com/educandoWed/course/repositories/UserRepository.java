package com.educandoWed.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoWed.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
