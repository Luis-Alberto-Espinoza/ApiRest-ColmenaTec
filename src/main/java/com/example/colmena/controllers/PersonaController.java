package com.example.colmena.controllers;

import com.example.colmena.entities.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.colmena.services.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl <Persona, PersonaServiceImpl> {


}