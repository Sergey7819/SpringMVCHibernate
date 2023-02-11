package com.kata.preproject.dao;

import com.kata.preproject.models.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> getAllPeople();
    Person getUser(int id);

    void save(Person person);

    void delete(int id);
}
