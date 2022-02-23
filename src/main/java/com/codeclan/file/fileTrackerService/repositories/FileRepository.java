package com.codeclan.file.fileTrackerService.repositories;

import com.codeclan.file.fileTrackerService.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
