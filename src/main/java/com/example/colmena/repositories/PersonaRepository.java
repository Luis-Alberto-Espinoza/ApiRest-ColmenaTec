package com.example.colmena.repositories;


import com.example.colmena.entities.Persona;

import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

}