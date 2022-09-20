package com.codeclan.filesystems.codeclanHWFilesFolder.repo;

import com.codeclan.filesystems.codeclanHWFilesFolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository <File, Long>{
}
