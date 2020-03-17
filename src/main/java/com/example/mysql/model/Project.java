package com.example.mysql.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Project {

    @Id
    @GeneratedValue
    private int id;
    private String projectName;
    private String projectDescription;

}
