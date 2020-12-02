package com.example.waveNetAPI.service;

import com.example.waveNetAPI.models.FileDB;
import org.springframework.web.multipart.MultipartFile;

import java.util.stream.Stream;

public interface FileDBService {
    FileDB store(MultipartFile file);
    FileDB get(String id);
    Stream<FileDB> getAllFiles();
}
