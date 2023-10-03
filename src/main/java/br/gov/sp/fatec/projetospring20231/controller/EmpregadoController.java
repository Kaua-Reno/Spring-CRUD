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

import br.gov.sp.fatec.projetospring20231.entity.Empregado;
import br.gov.sp.fatec.projetospring20231.service.IEmpregadoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/empregado")
public class EmpregadoController {

    @Autowired
    private IEmpregadoService service;

    @GetMapping
    public List<Empregado> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping(value = "/{empregado}")
    public Empregado buscarPorId(@PathVariable("empregado") Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Empregado novoEmpregado(@RequestBody Empregado empregado) {
        return service.novoEmpregado(empregado);
    }
 
}