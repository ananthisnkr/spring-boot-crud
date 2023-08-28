package com.example.Springbootdemoproject.Model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Person {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Name should not be null")
    @Column(name = "name")
    private String name;

    @Column(name ="age")
    private int age =0;

//
//    @CreationTimestamp
//    @Column(name="createdDt",nullable = false,updatable = false)
//    private Date createdAt;
//
//    @UpdateTimestamp
//    @Column(name="updatedDt")
//    private Date updatedAt;


}
