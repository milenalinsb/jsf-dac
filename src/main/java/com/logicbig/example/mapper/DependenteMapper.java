package com.logicbig.example.mapper;

import com.logicbig.example.controller.request.DependenteRequest;
import com.logicbig.example.controller.response.DependenteResponse;
import com.logicbig.example.domain.Dependente;

public class DependenteMapper {

    public static Dependente toEntity(DependenteRequest request) {
        Dependente dependente = new Dependente();
        dependente.setNome(request.getNome());
        dependente.setDataNascimento(request.getDataNascimento());
        return dependente;
    }

    public static DependenteResponse toResponse(Dependente dependente) {

        return DependenteResponse.builder()
                .id(dependente.getId())
                .nome(dependente.getNome())
                .dataNascimento(dependente.getDataNascimento())
                .pessoa(dependente.getPessoa())
                .build();
    }
}
