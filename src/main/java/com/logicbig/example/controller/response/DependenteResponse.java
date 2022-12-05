package com.logicbig.example.controller.response;

import com.logicbig.example.domain.Pessoa;
import lombok.*;

import java.time.LocalDate;

@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class DependenteResponse {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private Pessoa pessoa;
}

