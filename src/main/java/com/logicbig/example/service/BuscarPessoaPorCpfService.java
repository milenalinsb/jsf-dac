package com.logicbig.example.service;

import com.logicbig.example.domain.Pessoa;
import com.logicbig.example.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarPessoaPorCpfService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> porCpf(String cpf) {
        return (pessoaRepository.findAllByCpfContaining(cpf));
    }
}
