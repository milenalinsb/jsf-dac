package com.logicbig.example.service;

import com.logicbig.example.controller.response.PessoaResponse;
import com.logicbig.example.domain.Pessoa;
import com.logicbig.example.mapper.PessoaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListarPessoasPeloCpfService {

    @Autowired
    private BuscarPessoaPorCpfService buscarPessoaPorCpfService;


    public List<PessoaResponse> buscarPorCpf(String cpf) {

        List<PessoaResponse> pessoasResponse = new ArrayList<>();

        List<Pessoa> pessoas = buscarPessoaPorCpfService.porCpf(cpf);

        pessoas.forEach(pessoa -> {
            PessoaResponse response = PessoaMapper.toResponse(pessoa);
            pessoasResponse.add(response);
        });
        return pessoasResponse;
    }
}
