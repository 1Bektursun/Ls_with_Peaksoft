package Exam.Service;

import java.util.List;

public interface GenericService <T>{

    String add(List<T> t);
    Long getById(Long id);
    String removeByName(String name);
    List<T> getAll();
    List<T> sortByName();
    List<T> filterByGender();
    List<T> clear();


}
