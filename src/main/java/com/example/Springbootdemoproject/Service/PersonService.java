package com.example.Springbootdemoproject.Service;
import java.util.List;
import com.example.Springbootdemoproject.Model.Person;
public interface PersonService {

    List<Person> getPersons();

    Person addPerson(Person person);

    Person getPersonById(int id);

    void deletePersonById(int id);

    Person updatePerson(Person person);
}
