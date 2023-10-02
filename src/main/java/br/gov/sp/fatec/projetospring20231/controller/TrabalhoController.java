package br.gov.sp.fatec.projetospring20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projetospring20231.entity.Trabalho;
import br.gov.sp.fatec.projetospring20231.service.ITrabalhoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/trabalho")
public class TrabalhoController {

    @Autowired
    private ITrabalhoService service;

    @GetMapping
    public List<Trabalho> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping(value = "/{trabalho}")
    public Trabalho buscarPorId(@PathVariable("trabalho") Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho) {
        return service.novoTrabalho(trabalho);
    }
 
}