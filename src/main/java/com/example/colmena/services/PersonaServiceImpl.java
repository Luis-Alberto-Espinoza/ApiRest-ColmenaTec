package com.example.colmena.services;

import com.example.colmena.repositories.BaseRepository;
import com.example.colmena.repositories.PersonaRepository;
import com.example.colmena.entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
    super(baseRepository);
}


}