package com.example.Springbootdemoproject.Controller;

import com.example.Springbootdemoproject.Model.Person;
import com.example.Springbootdemoproject.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
public class DemoController {
    @Autowired
    PersonService personService;
    @GetMapping("/hello")
    public String getMesage(){
        return "Welcome everyone";
    }
    @GetMapping("/hello/{id}")
    public String getMessagebyId(@PathVariable long id){
        return "hello "+id;
    }

    @GetMapping("/hello/person")
    public String getMessagequeryparam(@RequestParam int id , @RequestParam int age){
        return " for the given id "+ id + " age " +age;
    }
    @PostMapping("/postmessage")
    public String postMessage(@RequestBody Person person){
        return "Person details "+person;

    }

    @GetMapping("/persons")
    public List<Person> getPersons(){
        List<Person> reslist = personService.getPersons();
        return reslist;
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@Valid @PathVariable int id){
        //Person person = personService.getPersonById(id);
        return personService.getPersonById(id);
    }
    @PostMapping("/persons")
    public Person addPerson(@Valid @RequestBody Person person){
        return personService.addPerson(person);
    }

    @DeleteMapping("/person")
    public void deletePersonById(@RequestParam int id){
         personService.deletePersonById(id);
    }

    @PutMapping("/person/{id}")
    public Person updatePerson(@PathVariable int id , @RequestBody Person person){
        person.setId(id);
        return personService.updatePerson(person);
    }
}