package com.cadastro.Alunos.controller;

import com.cadastro.Alunos.entity.PessoaEntity;
import com.cadastro.Alunos.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/aluno")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping("/cadastrar")
    public PessoaEntity salvar(@RequestBody PessoaEntity pessoa) {
        return service.salvar(pessoa);
    }

    @GetMapping("/buscar/{id}")
    public Optional<PessoaEntity> buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/atualizar/{id}")
    public Optional<PessoaEntity> atualizar(@PathVariable Long id, @RequestBody PessoaEntity pessoa) {
        return service.atualizar(id, pessoa);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}