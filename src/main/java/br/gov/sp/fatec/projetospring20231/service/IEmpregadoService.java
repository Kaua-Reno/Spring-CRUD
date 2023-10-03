package br.gov.sp.fatec.projetospring20231.service;

import java.util.List;

import br.gov.sp.fatec.projetospring20231.entity.Empregado;

public interface IEmpregadoService {
 
    public Empregado buscarPorId(Long id);

    public Empregado novoEmpregado(Empregado empregado);

    public List<Empregado> buscarTodos();

}
