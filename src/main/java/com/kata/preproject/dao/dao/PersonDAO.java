package com.kata.preproject.dao.dao;

import com.kata.preproject.models.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> index();
    Person getUser(int id);

    void save(Person person);

    void update(int id, Person person);

    void delete(int id);
}
