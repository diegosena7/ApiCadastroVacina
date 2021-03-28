package br.com.dsena.vacinas.controller;

import br.com.dsena.vacinas.entities.TbUsuario;
import br.com.dsena.vacinas.service.impl.UsuarioServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImplements usuarioServiceImplements;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbUsuario salvarUsuario(@RequestBody TbUsuario usuario){
        return usuarioServiceImplements.salvarUsuario(usuario);
    }
}
