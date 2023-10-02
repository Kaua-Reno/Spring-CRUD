package br.gov.sp.fatec.projetospring20231.service;

import java.util.List;

import br.gov.sp.fatec.projetospring20231.entity.Trabalho;

public interface ITrabalhoService {
 
    public Trabalho buscarPorId(Long id);

    public Trabalho novoTrabalho(Trabalho trabalho);

    public List<Trabalho> buscarTodos();

}
