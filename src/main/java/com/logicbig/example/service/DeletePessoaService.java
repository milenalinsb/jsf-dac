package com.logicbig.example.service;

import com.logicbig.example.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletePessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void delete(Long pessoaId) {

        pessoaRepository.deleteById(pessoaId);
    }
}
