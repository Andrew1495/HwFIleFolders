package com.codeclan.filesystems.codeclanHWFilesFolder.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "title")
    private String title;

    @OneToMany(mappedBy = "folder")
    @JsonIgnoreProperties({"folder"})
    private List<File> files;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Folder() {
    }

    public Folder(String title,  Person person) {
        this.title = title;
        this.files = new ArrayList<File>();
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void addFile(File file){
        this.files.add(file);
    }
}
