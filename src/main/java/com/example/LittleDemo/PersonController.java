package com.example.LittleDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "people")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewPerson(@RequestParam String firstName, @RequestParam String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        personRepository.save(person);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Person> getAllPeople(){
        return personRepository.findAll();
    }
}
