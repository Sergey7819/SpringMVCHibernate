package com.kata.preproject.service;

import com.kata.preproject.models.Person;

public interface PersonService {
    Object index();
    Object show(int id);

    void save(Person person);

    void update(int id, Person person);

    void delete(int id);
}
