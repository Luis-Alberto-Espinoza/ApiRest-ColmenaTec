package com.example.colmena.services;

import com.example.colmena.entities.Autor;
import com.example.colmena.repositories.AutorRepository;
import com.example.colmena.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository){
        super(baseRepository);
    }
}
