package com.cadastro.Alunos.repository;

import com.cadastro.Alunos.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer> {
}
