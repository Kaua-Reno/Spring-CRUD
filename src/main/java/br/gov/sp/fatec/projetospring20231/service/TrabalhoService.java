package br.gov.sp.fatec.projetospring20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projetospring20231.entity.Trabalho;
import br.gov.sp.fatec.projetospring20231.repository.TrabalhoRepository;

@Service
public class TrabalhoService implements ITrabalhoService{
 
    @Autowired
    private TrabalhoRepository trabalhoRepo;
    public Trabalho buscarPorId(Long id) {
        Optional<Trabalho> trabalhoOp = trabalhoRepo.findById(id);
        if(trabalhoOp.isPresent()) {
            return trabalhoOp.get();
        }
        throw new IllegalArgumentException("Id inválido!");
    }

    public Trabalho novoTrabalho(Trabalho trabalho) {
        if(trabalho == null ||
                trabalho.getTitulo() == null ||
                trabalho.getGrupo() == null ||
                trabalho.getNota() == null ||
                trabalho.getJustificativa() == null) {
            throw new IllegalArgumentException("Titulo, Grupo, Nota ou Justificativa inválidos!");
        }
        return trabalhoRepo.save(trabalho);
    }

    public List<Trabalho> buscarTodos() {
        return trabalhoRepo.findAll();
    }
}
