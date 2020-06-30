package com.example.codeclan.MockFileSystem.components;

import com.example.codeclan.MockFileSystem.models.File;
import com.example.codeclan.MockFileSystem.models.Folder;
import com.example.codeclan.MockFileSystem.models.User;
import com.example.codeclan.MockFileSystem.repositories.FileRepository;
import com.example.codeclan.MockFileSystem.repositories.FolderRepository;
import com.example.codeclan.MockFileSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public void run(ApplicationArguments args) {

        User user1 = new User("Woody");
        userRepository.save(user1);

        User user2 = new User("Buzz");
        userRepository.save(user2);

        Folder musicFolder = new Folder("Woodys Music", user1);
        folderRepository.save(musicFolder);

        Folder photoFolder = new Folder("Woodys Photos", user1);
        folderRepository.save(photoFolder);

        Folder spaceFolder = new Folder("Space Data", user2);
        folderRepository.save(musicFolder);

        Folder lightFolder = new Folder("Lightyear Photos", user2);
        folderRepository.save(lightFolder);


        user1.addFolder(musicFolder);
        user1.addFolder(photoFolder);
        user2.addFolder(lightFolder);
        user2.addFolder(spaceFolder);


        File musicFile1 = new File("Old Town Road", "mp3", 20, musicFolder);
        fileRepository.save(musicFile1);

        File musicFile2 = new File("Copperhead Road", "mp3", 30, musicFolder);
        fileRepository.save(musicFile2);

        File photo = new File("Woody and Jesse at the county Jail", "jpg", 356, photoFolder);
        fileRepository.save(photo);

//        File planetData1 = new File("Xrghthung", "jpeg", 200, spaceFolder);
//        fileRepository.save(planetData1);
//
        File lightyearPhoto = new File("Xrghthung Satalite image", "jpeg", 5, lightFolder);
        fileRepository.save(lightyearPhoto);
//
        musicFolder.addFile(musicFile1);
        musicFolder.addFile(musicFile2);
//
        photoFolder.addFile(photo);
//
        lightFolder.addFile(lightyearPhoto);
//        spaceFolder.addFile(planetData1);


    }




}
