package com.example.colmena.services;

import com.example.colmena.entities.Localidad;
import com.example.colmena.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServicioImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServicioImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
