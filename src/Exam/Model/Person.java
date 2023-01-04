package Exam.Model;


import java.util.*;
import Exam.Enums.Gender;
import Exam.Service.GenericService;

import java.util.List;

public class Person  {
    private Long id;
    private String name;
    private int age;
    private Gender gender;

    public Person(Long id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
