package br.com.dsena.vacinas.service.impl;

import br.com.dsena.vacinas.entities.TbUsuario;
import br.com.dsena.vacinas.repository.UsuarioRepository;
import br.com.dsena.vacinas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Classe responsável por implementar a Service e seus métodos através da sobrescrita.
Utiliza a anotação @Service para ser gerenciada a implementação da Service pelo Spring.
Fazemos a injeção de dependência usando a anotação @Autowired para utilizar o o Repository
e os métodos que estão sendo estendidos da JpaRepository.
 */
@Service
public class UsuarioServiceImplements implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    /*
    Retornamos aqui a instância que foi injetada do Repository e chamar o método save (do JpaRepository)
    passando como parâmetro os dados do usuário e da aplicação da vacina
     */
    @Override
    public TbUsuario salvarUsuario(TbUsuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
