package com.csdn.springbootmybatisdemo.service;

import com.csdn.springbootmybatisdemo.dao.PersonMapper;
import com.csdn.springbootmybatisdemo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;

    public Person findByUsername(String username) {
        return personMapper.find(username);
    }

    public List<Person> listUser() {
        return personMapper.list();
    }

    public int insertUser(Person person) {
        return personMapper.insert(person);
    }

    public int updateUser(Person person) {
        return personMapper.update(person);
    }


    public int delete(int id) {
        return personMapper.delete(id);
    }
}
