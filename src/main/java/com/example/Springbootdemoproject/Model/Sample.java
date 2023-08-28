package com.example.Springbootdemoproject.Model;
import com.example.Springbootdemoproject.Model.Person;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample {

    public static void main(String[] args){
        Person p1 = new Person(1,"saanvi", 5);
        Person p2 = new Person(2,"anu", 8);
        Person p3 = new Person(3,"hari", 12);
        Person p4 = new Person(4,"shiv", 3);
        Person p5 = new Person(5,"ganesh", 5);
        Person p6 = new Person(6,"vignesh", 7);
        Person p7 = new Person(7,"suresh", 8);
        Person p8 = new Person(8,"priti", 22);
        Person p9 = new Person(9,"akash", 7);
        List<Person> arlist = new ArrayList<Person>();
        arlist.add(p1);
        arlist.add(p2);
        arlist.add(p3);
        arlist.add(p4);
        arlist.add(p5);
        arlist.add(p6);
        arlist.add(p7);
        arlist.add(p8);
        arlist.add(p9);
        System.out.println(arlist);

        System.out.println("groupby based on age");
        Map<Integer, List<Person>> groupbyage = arlist.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(groupbyage);

       Map<Integer, Set<Person>> groupbyageset = arlist.stream().collect(Collectors.groupingBy(Person::getAge,Collectors.toSet()));
        System.out.println(groupbyageset);

    }
}
