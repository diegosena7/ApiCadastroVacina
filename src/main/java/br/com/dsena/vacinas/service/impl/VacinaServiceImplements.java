package br.com.dsena.vacinas.service.impl;

import br.com.dsena.vacinas.entities.TbCadastroAplicacaoVacinas;
import br.com.dsena.vacinas.repository.VacinaRepository;
import br.com.dsena.vacinas.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
Classe responsável por implementar a Service e seus métodos através da sobrescrita.
Utiliza a anotação @Service para ser gerenciada a implementação da Service pelo Spring.
Fazemos a injeção de dependência usando a anotação @Autowired para utilizar o o Repository
e os métodos que estão sendo estendidos da JpaRepository.
 */
@Service
public class VacinaServiceImplements implements VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    /*
    Retornamos aqui a instância que foi injetada do Repository e chamar o método save (do JpaRepository)
    passando como parâmetro os dados do usuário e da aplicação da vacina
     */
    @Override
    public TbCadastroAplicacaoVacinas salvarAplicacaoVacina(TbCadastroAplicacaoVacinas vacina) {
        return vacinaRepository.save(vacina);
    }
}
