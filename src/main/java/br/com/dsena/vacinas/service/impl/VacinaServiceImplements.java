package br.com.dsena.vacinas.service.impl;

import br.com.dsena.vacinas.entities.TbCadastroAplicacaoVacinas;
import br.com.dsena.vacinas.repository.VacinaRepository;
import br.com.dsena.vacinas.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinaServiceImplements implements VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    @Override
    public TbCadastroAplicacaoVacinas salvarAplicacaoVacina(TbCadastroAplicacaoVacinas vacina) {
        return vacinaRepository.save(vacina);
    }
}
