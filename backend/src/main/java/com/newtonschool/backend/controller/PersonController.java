package com.newtonschool.backend.controller;

import com.newtonschool.backend.dao.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PersonController {

    @GetMapping(
            path = "/api/person",
            produces = "application/json"
    )
    public List<Person> getPersonalsDetails(){
        Person person = new Person(
                "1",
                "Sumit",
                "Busa",
                "sumitbusa@gmail.com",
                "8879266829",
                true
        );
        Person person2 = new Person(
                "2",
                "Suraj",
                "pal",
                "surajpal@gmail.com",
                "1234456",
                false
        );
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        return personList;
    }


    @GetMapping(
            path = "/api/personId"
    )
    @ResponseBody
    public Person getPersonal(@RequestParam  String id){
        System.out.println("User Request for person Detail by ID");
        Person person = new Person(
                "1",
                "Sumit",
                "Busa",
                "sumitbusa@gmail.com",
                "8879266829",
                true
        );
        Person person2 = new Person(
                "2",
                "Suraj",
                "pal",
                "surajpal@gmail.com",
                "1234456",
                false
        );
        Map<String, Person> map = new HashMap<>();
        map.put("1",person);
        map.put("2",person2);
        return map.get(id);

    }
}
