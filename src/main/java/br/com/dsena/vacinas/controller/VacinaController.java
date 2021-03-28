package br.com.dsena.vacinas.controller;

import br.com.dsena.vacinas.entities.TbCadastroAplicacaoVacinas;
import br.com.dsena.vacinas.service.impl.VacinaServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    @Autowired
    private VacinaServiceImplements vacinaServiceImplements;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbCadastroAplicacaoVacinas salvarAplicacaoVacina(@RequestBody TbCadastroAplicacaoVacinas vacina){
        return vacinaServiceImplements.salvarAplicacaoVacina(vacina);
    }
}
