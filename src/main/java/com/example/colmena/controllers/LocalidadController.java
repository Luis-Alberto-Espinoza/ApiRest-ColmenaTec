package com.example.colmena.controllers;

import com.example.colmena.entities.Localidad;
import com.example.colmena.services.LocalidadServicioImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = " api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServicioImpl> {
}
