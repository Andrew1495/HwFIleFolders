package com.codeclan.filesystems.codeclanHWFilesFolder.repo;

import com.codeclan.filesystems.codeclanHWFilesFolder.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository <Person, Long> {
}
