package Exam.Service.impl;

import Exam.Dao.Database;
import Exam.Model.Animal;
import Exam.Service.GenericService;

import java.util.List;

public class AnimalServiceImpl implements GenericService<Animal> {
    Database data;

    @Override
    public String add(List<Animal> t) {
        return null;
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
    public List<Animal> getAll() {
        return null;
    }

    @Override
    public List<Animal> sortByName() {
        return null;
    }

    @Override
    public List<Animal> filterByGender() {
        return null;
    }

    @Override
    public List<Animal> clear() {
        return null;
    }
}
