package com.logicbig.example.mapper;

import com.logicbig.example.controller.request.PessoaRequest;
import com.logicbig.example.controller.response.PessoaResponse;
import com.logicbig.example.domain.Pessoa;

public class PessoaMapper {

    public static Pessoa toEntity(PessoaRequest request) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(request.getNome());
        pessoa.setCpf(request.getCpf());
        return pessoa;
    }

    public static PessoaResponse toResponse(Pessoa pessoa) {

        return PessoaResponse.builder()
                .id(pessoa.getId())
                .nome(pessoa.getNome())
                .cpf(pessoa.getCpf())
                .build();
    }
}
