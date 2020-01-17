package com.spring.cadastrarusuario.services;

import com.spring.cadastrarusuario.models.Person;
import com.spring.cadastrarusuario.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repo;

    public List<Person> searchAll() {
        return repo.findAll();
    }

    public Person searchById(Long id) {
        Optional<Person> obj = repo.findById(id);
        return obj.orElse(null);
    }

    //method POST


    //method PUT


    //method DELETE

}
