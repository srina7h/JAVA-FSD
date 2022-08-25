package com.nseit.studentcourse.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue
    private Integer id;
    private String courseName;
    private Integer duration;
    @ManyToMany(mappedBy = "course")
    private List<Student> student;
}
