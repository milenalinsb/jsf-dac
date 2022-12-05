package com.logicbig.example.service;

import com.logicbig.example.controller.request.ConverterDependenteRequest;
import com.logicbig.example.controller.response.DependenteResponse;
import com.logicbig.example.domain.Dependente;
import com.logicbig.example.domain.Pessoa;
import com.logicbig.example.mapper.DependenteMapper;
import com.logicbig.example.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversorDependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    @Autowired
    private BuscarDependenteService buscarDependenteService;

    @Autowired
    private BuscarPessoaService buscarPessoaService;

    public DependenteResponse converter(Long dependenteId, ConverterDependenteRequest request) {

        Dependente dependente = buscarDependenteService.porId(dependenteId);
        Pessoa pessoa = buscarPessoaService.porId(request.getPessoaId());

        dependente.setPessoa(pessoa);

        dependenteRepository.save(dependente);
        return DependenteMapper.toResponse(dependente);
    }

}
