package com.tripleace.microservice.service.serviceImpl;

import com.tripleace.microservice.mapper.TeacherMapper;
import com.tripleace.microservice.model.Teacher;
import com.tripleace.microservice.repository.TeacherRepository;
import com.tripleace.microservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {

        return teacherMapper.convertEntityToModel
                (teacherRepository.save(teacherMapper.convertModelToEntity(teacher)));
    }
}


