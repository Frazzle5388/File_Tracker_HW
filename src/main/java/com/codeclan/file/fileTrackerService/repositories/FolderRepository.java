package com.codeclan.file.fileTrackerService.repositories;

import com.codeclan.file.fileTrackerService.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
