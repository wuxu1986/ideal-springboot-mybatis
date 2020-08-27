package com.csdn.springbootmybatisdemo.controller;

import com.csdn.springbootmybatisdemo.domain.Person;
import com.csdn.springbootmybatisdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/person",method = {RequestMethod.GET,RequestMethod.POST})
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/listone")
    @ResponseBody
    public Person listOne(String username){
        return personService.findByUsername(username);
    }


    @RequestMapping("/listall")
    @ResponseBody
    public List<Person> listAll(){
        return personService.listUser();
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    @ResponseBody
    public String add(Person person){
        int result=personService.insertUser(person);
        if(result>=1){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    @RequestMapping(value="/update",method = RequestMethod.POST)
    @ResponseBody
    public String update(Person user){
        int result=personService.updateUser(user);
        if(result>=1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    @RequestMapping(value="/delete",method = RequestMethod.GET)
    @ResponseBody
    public String delete(int id){
        int result=personService.delete(id);
        if(result>=1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
}












