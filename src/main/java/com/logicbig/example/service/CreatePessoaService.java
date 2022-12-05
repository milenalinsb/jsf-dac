package com.logicbig.example.service;

import com.logicbig.example.controller.request.PessoaRequest;
import com.logicbig.example.controller.response.PessoaResponse;
import com.logicbig.example.domain.Pessoa;
import com.logicbig.example.mapper.PessoaMapper;
import com.logicbig.example.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaResponse create(PessoaRequest request) {
        Pessoa pessoa = PessoaMapper.toEntity(request);

        pessoaRepository.save(pessoa);

        return PessoaMapper.toResponse(pessoa);
    }
}
