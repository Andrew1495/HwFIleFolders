package com.codeclan.filesystems.codeclanHWFilesFolder.Controllers;

import com.codeclan.filesystems.codeclanHWFilesFolder.models.File;
import com.codeclan.filesystems.codeclanHWFilesFolder.models.Person;
import com.codeclan.filesystems.codeclanHWFilesFolder.repo.FileRepository;
import com.codeclan.filesystems.codeclanHWFilesFolder.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PersonController {


        @Autowired
        PersonRepository personRepo;

        @GetMapping(value = "/person")
        public ResponseEntity<List<Person>> getAllPersons(){
            return new ResponseEntity<>(personRepo.findAll(), HttpStatus.OK);
        }


        @GetMapping(value = "/persons/{id}")
        public ResponseEntity getPerson(@PathVariable Long id){
            return new ResponseEntity<>(personRepo.findById(id), HttpStatus.OK);
        }

        @PostMapping(value = "/persons")
        public ResponseEntity<Person> postPirate(@RequestBody Person person){
            personRepo.save(person);
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        }

    }


