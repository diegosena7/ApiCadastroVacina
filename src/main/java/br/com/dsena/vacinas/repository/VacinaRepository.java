package br.com.dsena.vacinas.repository;

import br.com.dsena.vacinas.entities.TbCadastroAplicacaoVacinas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<TbCadastroAplicacaoVacinas, Long> {
}
