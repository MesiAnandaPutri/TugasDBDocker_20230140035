package com.praktikumDB.Deploy.repository;

import com.praktikumDB.Deploy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}