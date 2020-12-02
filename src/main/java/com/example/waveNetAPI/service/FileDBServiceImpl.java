package com.example.waveNetAPI.service;

import com.example.waveNetAPI.dao.FileDBDao;
import com.example.waveNetAPI.models.FileDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.stream.Stream;

public class FileDBServiceImpl implements FileDBService {

    @Autowired
    private FileDBDao fileDBDao;

    @Override
    public FileDB store(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());

        return fileDBDao.save(FileDB);
    }

    @Override
    public FileDB get(String id) {
        return fileDBDao.findById(id).get();
    }

    @Override
    public Stream<FileDB> getAllFiles() {
        return fileDBDao.findAll().stream();
    }
}
