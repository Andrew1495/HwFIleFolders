package com.codeclan.filesystems.codeclanHWFilesFolder.repo;

import com.codeclan.filesystems.codeclanHWFilesFolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
