package Exam.Dao;

import Exam.Model.Animal;
import Exam.Model.Person;

import java.util.List;

public class Database {
    private List<Person> persons;
    private List<Animal> animals;

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
