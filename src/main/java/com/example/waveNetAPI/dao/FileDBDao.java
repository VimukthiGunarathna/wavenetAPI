package com.example.waveNetAPI.dao;

import com.example.waveNetAPI.models.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBDao extends JpaRepository<FileDB,String> {
}
