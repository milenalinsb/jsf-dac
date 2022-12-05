package com.logicbig.example.repository;

import com.logicbig.example.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    List<Pessoa> findAllByCpfContaining(String cpf);

    Optional<Pessoa> findByCpf(String pessoaCpf);
}
