package com.example.codeclan.MockFileSystem.repositories;

import com.example.codeclan.MockFileSystem.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
