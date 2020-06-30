package com.example.codeclan.MockFileSystem.repositories;

import com.example.codeclan.MockFileSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
