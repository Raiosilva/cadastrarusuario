package com.spring.cadastrarusuario.resources;

import com.spring.cadastrarusuario.models.Person;
import com.spring.cadastrarusuario.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {

    @Autowired
    private PersonService service;

    @GetMapping(value = "")
    public ResponseEntity <List<Person>> searchAll() {
        List<Person> list = service.searchAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity <Person> searchById(@PathVariable Long id) {
        Person obj = service.searchById(id);
        return ResponseEntity.ok().body(obj);
    }

    //method POST


    //method PUT


    //method DELETE
}
