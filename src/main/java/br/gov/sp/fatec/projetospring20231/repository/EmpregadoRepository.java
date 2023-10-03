package br.gov.sp.fatec.projetospring20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetospring20231.entity.Empregado;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long>{
 
}
