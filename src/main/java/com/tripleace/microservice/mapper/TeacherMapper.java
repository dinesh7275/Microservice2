package com.tripleace.microservice.mapper;

import com.tripleace.microservice.entity.TeacherEntity;
import com.tripleace.microservice.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherMapper {

    @Autowired
    private AddressMapper addressMapper;

    public TeacherEntity convertModelToEntity(Teacher teacherModel) {
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setId(teacherModel.getId());
        teacherEntity.setFirstName(teacherModel.getFirstName());
        teacherEntity.setLastName(teacherModel.getLastName());
        teacherEntity.setSubject(teacherModel.getSubject());
        teacherEntity.setAddress(addressMapper.convertModelToEntity(teacherModel.getAddress()));
        return teacherEntity;

    }
    public Teacher convertEntityToModel(TeacherEntity teacherEntity)
    {
        Teacher teacherModel = new Teacher();
        teacherModel.setId(teacherEntity.getId());
        teacherModel.setFirstName(teacherEntity.getFirstName());
        teacherModel.setLastName(teacherEntity.getFirstName());
        teacherModel.setSubject(teacherEntity.getSubject());
        teacherModel.setAddress(addressMapper.covertEntityToModel(teacherEntity.getAddress()));
        return teacherModel ;
    }
}