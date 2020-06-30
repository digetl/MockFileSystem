package com.example.codeclan.MockFileSystem.controllers;

import com.example.codeclan.MockFileSystem.models.File;
import com.example.codeclan.MockFileSystem.models.Folder;
import com.example.codeclan.MockFileSystem.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return  new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK) ;
    }

    @PostMapping(value = "/files")
    public ResponseEntity<File> postFile(@RequestBody File file ) {
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/files/{id}")
    public ResponseEntity<File> deleteFile(@PathVariable Long id) {
        fileRepository.deleteById(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }


}
