package br.com.dsena.vacinas.repository;

import br.com.dsena.vacinas.entities.TbUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<TbUsuario, Long> {


}
