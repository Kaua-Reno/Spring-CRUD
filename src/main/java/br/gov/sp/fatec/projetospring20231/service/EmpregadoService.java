package br.gov.sp.fatec.projetospring20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetospring20231.entity.Empregado;
import br.gov.sp.fatec.projetospring20231.repository.EmpregadoRepository;

@Service
public class EmpregadoService implements IEmpregadoService{
 
    @Autowired
    private EmpregadoRepository empregadoRepo;
    public Empregado buscarPorId(Long id) {
        Optional<Empregado> empregadoOp = empregadoRepo.findById(id);
        if(empregadoOp.isPresent()) {
            return empregadoOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public Empregado novoEmpregado(Empregado empregado) {
        if(empregado == null ||
                empregado.getNome() == null ||
                empregado.getCtps() == null ||
                empregado.getData() == null ||
                empregado.getEmail() == null) {
            throw new IllegalArgumentException("Nome, CTPS, Data ou Email inválidos!");
        }
        return empregadoRepo.save(empregado);
    }

    public List<Empregado> buscarTodos() {
        return empregadoRepo.findAll();
    }
}
