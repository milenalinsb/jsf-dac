package com.logicbig.example.service;

import com.logicbig.example.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    public void delete(Long dependenteId) {

        dependenteRepository.deleteById(dependenteId);
    }
}
