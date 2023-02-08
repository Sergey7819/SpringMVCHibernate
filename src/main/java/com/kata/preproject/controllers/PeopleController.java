package com.kata.preproject.controllers;

import com.kata.preproject.models.Person;
import com.kata.preproject.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PeopleController {

    private final PersonService personService;

    public PeopleController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Person> people = personService.index();
        model.addAttribute("allPeople", people);
        return "index";
    }

    @GetMapping("/new")
    public String create(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "new";
    }



    @PostMapping ("/save")
    public String save(@ModelAttribute("person") Person person) {
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam("id") int id, Model model) {
        model.addAttribute("person", personService.getUser(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("person") Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "edit";
        personService.update(person);
        return "redirect:/";
    }



    @GetMapping("/delete")
    public String deletePerson(@RequestParam("id") int id) {
        personService.delete(id);
        return "redirect:/";
    }


}