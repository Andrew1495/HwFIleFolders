package com.codeclan.filesystems.codeclanHWFilesFolder.Controllers;

import com.codeclan.filesystems.codeclanHWFilesFolder.models.File;
import com.codeclan.filesystems.codeclanHWFilesFolder.models.Folder;
import com.codeclan.filesystems.codeclanHWFilesFolder.repo.FileRepository;
import com.codeclan.filesystems.codeclanHWFilesFolder.repo.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FolderController {
        @Autowired
        FolderRepository folderRepo;

        @GetMapping(value = "/folders")
        public ResponseEntity<List<Folder>> getAllFolders(){
            return new ResponseEntity<>(folderRepo.findAll(), HttpStatus.OK);
        }


        @GetMapping(value = "/folders/{id}")
        public ResponseEntity getFolder(@PathVariable Long id){
            return new ResponseEntity<>(folderRepo.findById(id), HttpStatus.OK);
        }

        @PostMapping(value = "/folder")
        public ResponseEntity<Folder> postPirate(@RequestBody Folder folder){
            folderRepo.save(folder);
            return new ResponseEntity<>(folder, HttpStatus.CREATED);
        }

    }


