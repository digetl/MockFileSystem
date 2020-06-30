package com.example.codeclan.MockFileSystem.repositories;

import com.example.codeclan.MockFileSystem.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
