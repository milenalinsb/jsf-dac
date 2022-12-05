package com.logicbig.example.controller.response;

import lombok.*;

@Builder @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class PessoaResponse {

    private Long id;
    private String nome;
    private String cpf;
}
