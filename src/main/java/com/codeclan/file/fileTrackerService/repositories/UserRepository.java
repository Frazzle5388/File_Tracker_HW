package com.codeclan.file.fileTrackerService.repositories;

import com.codeclan.file.fileTrackerService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
