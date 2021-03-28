package br.com.dsena.vacinas.controller;

import br.com.dsena.vacinas.entities.TbUsuario;
import br.com.dsena.vacinas.service.impl.UsuarioServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/*
Classe responsável por interagir com a view e outras partes do sistema, que são as
regras de negócios e o banco de dados.
Utilizamos as anotações @RestController (para serem gerenciadas pelo Spring) e com @RequestMapping
indicado para o Spring qual é a rota dos endpoints que ele deve redirecionar as requisições.
Rota “/usuário”.
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImplements usuarioServiceImplements;

    /*
    Método responsável por fazer a persistência dos dados e usamos a anotação @PostMapping
    para indicar ao Spring que trata-se de uma requisição do tipo POST (seta uma informação no BD).
    Usamos a anotação @ReponseStatus, que vai retornar o status HTTP 201 Created, caso a operação seja bem sucedida.
    Passamos por parâmetro uma entidade de usuário utilizando a anotação @RequestBody que é
    responsável por requisitar um corpo de argumentos em métodos HTTP e retornamos a instância
    que foi injetada do Service e chamo o método que criei (salvarUsuário).
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbUsuario salvarUsuario(@RequestBody TbUsuario usuario){
        return usuarioServiceImplements.salvarUsuario(usuario);
    }
}
