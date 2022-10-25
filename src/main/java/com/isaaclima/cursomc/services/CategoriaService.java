package com.isaaclima.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaaclima.cursomc.domain.Categoria;
import com.isaaclima.cursomc.repositories.CategoriaRepository;
import com.isaaclima.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {

        Optional<Categoria> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
