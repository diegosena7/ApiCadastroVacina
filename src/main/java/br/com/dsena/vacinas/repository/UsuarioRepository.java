package br.com.dsena.vacinas.repository;

import br.com.dsena.vacinas.entities.TbUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
Classe responsável pelas transações com o banco de dados, obtemos os dados do banco de dados e reistramos
as regras de negócio.
Extends a classe JpaRepository, biblioteca que que faz o acesso e comunicação com o BD, podemos através dela
usar os métodos para salvar entidade, buscar por id, buscar tudo, deletar por id, update por id, entre outros.
 */
@Repository
public interface UsuarioRepository extends JpaRepository<TbUsuario, Long> {
}
