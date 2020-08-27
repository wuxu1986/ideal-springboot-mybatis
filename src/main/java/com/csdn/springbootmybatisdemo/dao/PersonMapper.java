package com.csdn.springbootmybatisdemo.dao;

import com.csdn.springbootmybatisdemo.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PersonMapper {
    Person find(String username);
    List<Person> list();
    int insert(Person user);
    int delete(int id);
    int update(Person user);
}
