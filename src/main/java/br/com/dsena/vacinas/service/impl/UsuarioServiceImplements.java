package br.com.dsena.vacinas.service.impl;

import br.com.dsena.vacinas.entities.TbUsuario;
import br.com.dsena.vacinas.repository.UsuarioRepository;
import br.com.dsena.vacinas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImplements implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public TbUsuario salvarUsuario(TbUsuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
