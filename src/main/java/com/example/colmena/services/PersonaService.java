package com.example.colmena.services;

import com.example.colmena.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long>{
    List<Persona>search(String filtro)throws Exception;
}
