package com.logicbig.example.service;

import com.logicbig.example.controller.request.UpdatePessoaRequest;
import com.logicbig.example.controller.response.PessoaResponse;
import com.logicbig.example.domain.Pessoa;
import com.logicbig.example.mapper.PessoaMapper;
import com.logicbig.example.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdatePessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private BuscarPessoaService buscarPessoaService;

    public PessoaResponse update(Long pessoaId, UpdatePessoaRequest request) {

        Pessoa pessoa = buscarPessoaService.porId(pessoaId);

        pessoa.setNome(request.getNome());

        pessoaRepository.save(pessoa);
        return PessoaMapper.toResponse(pessoa);
    }
}
