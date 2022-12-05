package com.logicbig.example.service;

import com.logicbig.example.controller.response.PessoaResponse;
import com.logicbig.example.mapper.PessoaMapper;
import com.logicbig.example.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class ListarPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaResponse> readAll() {
        return pessoaRepository.findAll().stream().map(PessoaMapper::toResponse).collect(toList());
    }

    public PessoaResponse readOnly(Long id) {
        return pessoaRepository.findById(id).map(PessoaMapper::toResponse)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Pessoa não encontrado"));
    }

}
