package com.example.mysql.Controller;


import com.example.mysql.dao.ProjectRepo;
import com.example.mysql.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestControllerP
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectRepo repo;

    @GetMapping("/getProjects")
    public List<Project> getAllProjects() {
        return  repo.findAll();
    }

    @PostMapping("/postProject")
    public String postProject(Project addedProject) {
        repo.save(addedProject);
        return "added";
    }

    @DeleteMapping("delete/{projectName}")
    public String deleteroject(@PathVariable("projectName") String name) {
        repo.deleteByprojectName(name);

        return "deleted";
    }

}
