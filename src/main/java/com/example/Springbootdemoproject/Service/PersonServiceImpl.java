package com.example.Springbootdemoproject.Service;

import com.example.Springbootdemoproject.Model.Person;
import com.example.Springbootdemoproject.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;
    @Override
    public List<Person> getPersons() {

        return personRepository.findAll();
    }

    @Override
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person getPersonById(int id) {
        Optional<Person> personid = personRepository.findById(id);
        if(personid.isPresent()){
            return personid.get();
        }
        else {
            throw new RuntimeException("the given id does not match ");
        }
    }

    @Override
    public void deletePersonById(int id) {
         personRepository.deleteById(id);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }


}
