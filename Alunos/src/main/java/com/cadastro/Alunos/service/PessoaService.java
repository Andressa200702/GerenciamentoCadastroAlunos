package com.cadastro.Alunos.service;

import com.cadastro.Alunos.entity.PessoaEntity;
import com.cadastro.Alunos.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public PessoaEntity salvar(PessoaEntity pessoa) {
        return repository.save(pessoa);
    }

    public Optional<PessoaEntity> buscar(Long id) {
        return repository.findById(id);
    }

    public Optional<PessoaEntity> atualizar(Long id, PessoaEntity pessoa) {
        return repository.findById(id).map(existente -> {
            existente.setNome(pessoa.getNome());
            existente.setIdade(pessoa.getIdade());
            existente.setEmail(pessoa.getEmail());
            existente.setTelefone(pessoa.getTelefone());
            return repository.save(existente);
        });
    }

    public boolean excluir(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}