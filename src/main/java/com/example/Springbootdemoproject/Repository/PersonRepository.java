package com.example.Springbootdemoproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Springbootdemoproject.Model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
