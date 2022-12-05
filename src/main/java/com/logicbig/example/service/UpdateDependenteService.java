package com.logicbig.example.service;

import com.logicbig.example.controller.request.UpdateDependenteRequest;
import com.logicbig.example.controller.response.DependenteResponse;
import com.logicbig.example.domain.Dependente;
import com.logicbig.example.mapper.DependenteMapper;
import com.logicbig.example.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    @Autowired
    private BuscarDependenteService buscarDependenteService;

    public DependenteResponse update(Long dependenteId, UpdateDependenteRequest request) {

        Dependente dependente = buscarDependenteService.porId(dependenteId);

        dependente.setNome(request.getNome());
        dependente.setDataNascimento(request.getDataNascimento());

        dependenteRepository.save(dependente);
        return DependenteMapper.toResponse(dependente);
    }
}
