package com.logicbig.example.service;

import com.logicbig.example.controller.request.DependenteRequest;
import com.logicbig.example.controller.response.DependenteResponse;
import com.logicbig.example.domain.Dependente;
import com.logicbig.example.domain.Pessoa;
import com.logicbig.example.mapper.DependenteMapper;
import com.logicbig.example.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    @Autowired
    private BuscarPessoaService buscarPessoaService;

    public DependenteResponse create(DependenteRequest request) {
        Pessoa pessoa = buscarPessoaService.porId(request.getPessoa());

        Dependente dependente = DependenteMapper.toEntity(request);
        dependente.setPessoa(pessoa);

        dependenteRepository.save(dependente);

        return DependenteMapper.toResponse(dependente);
    }
}
