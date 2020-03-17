package com.example.mysql.dao;

import com.example.mysql.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Integer> {
    void deleteByprojectName(String name);
}
