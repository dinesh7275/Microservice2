package com.tripleace.microservice.controller;

import com.tripleace.microservice.model.Teacher;
import com.tripleace.microservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
     public Teacher saveTeacher (@RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);

    }


}
