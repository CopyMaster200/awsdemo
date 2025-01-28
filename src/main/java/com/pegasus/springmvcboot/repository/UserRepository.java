package com.pegasus.springmvcboot.repository;

import com.pegasus.springmvcboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
