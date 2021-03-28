package br.com.dsena.vacinas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/*
Utilizado as anotações do Lombok, @Id onde é referenciada a PK e @Column onde é referenciada o nome da coluna da tabela
A @Entity referencia a classe como uma Entidade e na PK usamos a anotação para gerar automaticamente a sequência do Id
do tipo IDENTITY, através da anotação @GeneratedValue.
Foi utilizado a anotação @JsonFormat para formatar a data recebida para o padrão brasileiro (dd/mm/yyyy).
Gerado getters and seters através da anotação @Data com o auxílio do Lombok
 */
@Data
@Entity
@Table(name="tb_cadastro_aplicadao_vacina")
public class TbCadastroAplicacaoVacinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vacina;

    @Column(name="nome_vacina", nullable = false)
    private String nomeVacina;

    @Column(name="email_usuario", nullable = false, updatable = false)
    private String emailUsuario;

    @Column(name="data_vacina", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVacina;
}
