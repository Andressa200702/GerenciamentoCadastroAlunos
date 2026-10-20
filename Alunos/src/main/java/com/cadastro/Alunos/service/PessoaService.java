package com.cadastro.Alunos.service;

import com.cadastro.Alunos.entity.PessoaEntity;
import com.cadastro.Alunos.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {
    private PessoaRepository repository;

    public PessoaService(PessoaRepository repository){
        this.repository = repository;
    }

    public PessoaEntity salvar(PessoaEntity pessoa){
        return repository.save(pessoa);
    }

    public Optional<PessoaEntity> buscar(int id){
        return repository.findById(id);
    }

    /*
    arrumarr
    public PessoaEntity atualizar(Integer id, PessoaEntity pessoa){
        return repository.save(pessoa);
    }

    public void excluir(int id){
        repository.deleteById(id);
    }

     */
}
