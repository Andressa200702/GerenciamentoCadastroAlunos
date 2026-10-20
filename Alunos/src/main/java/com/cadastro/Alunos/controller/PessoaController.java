package com.cadastro.Alunos.controller;

import com.cadastro.Alunos.entity.PessoaEntity;
import com.cadastro.Alunos.repository.PessoaRepository;
import com.cadastro.Alunos.service.PessoaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class PessoaController {

    private PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @PostMapping("/cadastrar")
    public PessoaEntity salvar(@RequestBody PessoaEntity pessoa) {
        return service.salvar(pessoa);
    }

    /*
    arrumar
    @GetMapping ("/{id}")
    public PessoaEntity buscar(@PathVariable int id){
        service.buscar(id);
    }

    @PutMapping("/{id}")
    public PessoaEntity atualizar(@PathVariable int id, @RequestBody PessoaEntity pessoa){
        return service.atualizar(id, pessoa);
    }

    @DeleteMapping("/{id}")
    public PessoaRepository excluir(@PathVariable int id){
        service.excluir(id);
    }
     */

}
