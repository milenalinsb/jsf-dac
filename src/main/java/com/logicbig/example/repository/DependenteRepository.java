package com.logicbig.example.repository;

import com.logicbig.example.domain.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependenteRepository extends JpaRepository<Dependente, Long> {
}
