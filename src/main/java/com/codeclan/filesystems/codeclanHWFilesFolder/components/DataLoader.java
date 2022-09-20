package com.codeclan.filesystems.codeclanHWFilesFolder.components;

import com.codeclan.filesystems.codeclanHWFilesFolder.models.File;
import com.codeclan.filesystems.codeclanHWFilesFolder.models.Folder;
import com.codeclan.filesystems.codeclanHWFilesFolder.models.Person;
import com.codeclan.filesystems.codeclanHWFilesFolder.repo.FileRepository;
import com.codeclan.filesystems.codeclanHWFilesFolder.repo.FolderRepository;
import com.codeclan.filesystems.codeclanHWFilesFolder.repo.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepo;
    @Autowired
    FolderRepository folderRepo;
    @Autowired
    PersonRepository personRepo;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person andrew = new Person("Andrew");
        Folder folder = new Folder("programing", andrew);

        File file1 = new File("javastuff", ".java", 100.01, folder);
        File file2 = new File("Python", ".py", 10.01, folder);
        File file3 = new File("Js", ".js", 102.01, folder);

        folder.addFile(file1);
        folder.addFile(file2);
        folder.addFile(file3);

        andrew.addFolder(folder);
        personRepo.save(andrew);
        folderRepo.save(folder);
        fileRepo.save(file1);
        fileRepo.save(file2);
        fileRepo.save(file3);




    }
}