package Exam.Service.impl;

import Exam.Dao.Database;
import Exam.Model.Person;
import Exam.Service.GenericService;

import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {
    Database data;

    @Override
    public String add(List<Person> t) {
        data.getPersons().addAll(t);
        return "successfully add";
    }

    @Override
    public Long getById(Long id) {
        return null;
    }

    @Override
    public String removeByName(String name) {
        return null;
    }

    @Override
    public List<Person> getAll() {

        return null;
    }

    @Override
    public List<Person> sortByName() {
        return null;
    }

    @Override
    public List<Person> filterByGender() {
        return null;
    }

    @Override
    public List<Person> clear() {
        return null;
    }
}
