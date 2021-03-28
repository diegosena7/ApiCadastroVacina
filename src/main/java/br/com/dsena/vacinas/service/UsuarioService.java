package br.com.dsena.vacinas.service;

import br.com.dsena.vacinas.entities.TbUsuario;

/*
Classe responsável por registrar somente as regras de negócio, não acessa diretamente o BD, é a subcamada
responsável pela regra de negócio, onde validamos dados e executamos as regras do negócio.
Utiliza a Repository e a Entity para ter acesso ao banco de dados e persistir os dados.
 */
public interface UsuarioService {
    TbUsuario salvarUsuario (TbUsuario usuario);
}
