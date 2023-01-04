package Exam;

import Exam.Enums.Gender;
import Exam.Model.Person;
import Exam.Service.impl.PersonServiceImpl;

import java.util.List;

public class Test {
    public static final PersonServiceImpl servicePerson=new PersonServiceImpl();
    public static void main(String[] args) {
        servicePerson.add(List.of(new Person(1L,"Adam",18, Gender.MALE)));

    }
}
