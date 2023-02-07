package com.kata.preproject.service;

import com.kata.preproject.models.Person;

import java.util.List;

public interface PersonService {
    List<Person> index();
    Person getUser(int id);

    void save(Person person);

    void update(int id, Person person);

    void delete(int id);
}
