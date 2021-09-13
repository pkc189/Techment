package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String string);

}
